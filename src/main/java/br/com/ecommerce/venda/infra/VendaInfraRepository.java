package br.com.ecommerce.venda.infra;

import br.com.ecommerce.handler.APIException;
import br.com.ecommerce.venda.application.repository.VendaRepository;
import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VendaInfraRepository implements VendaRepository {
    private final VendaSpringDataJPARepository vendaSpringDataJPARepository;
    @Override
    public Venda salva(Venda venda) {
        log.info("[inicia] VendaInfraRepository - salva");
        try {
            vendaSpringDataJPARepository.save(venda);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados! ", e);
        }
        log.info("[finaliza] VendaInfraRepository - salva");
        return venda;
    }

    @Override
    public List<Venda> buscaTodasVendas() {
        log.info("[inicia] VendaInfraRepository - buscaTodasVendas");
        List<Venda> todasVendas = vendaSpringDataJPARepository.findAll();
        log.info("[finaliza] VendaInfraRepository - buscaTodasVendas");
        return todasVendas;
    }

    @Override
    public Venda buscaVendaAtravesId(UUID idVenda) {
        log.info("[inicia] VendaInfraRepository - buscaVendaAtravesId");
        Venda venda = vendaSpringDataJPARepository.findById(idVenda)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Venda não encontrada"));
        log.info("[finaliza] VendaInfraRepository - buscaVendaAtravesId");
        return venda;
    }

    @Override
    public List<Venda> findByStatusVenda(StatusVenda statusVenda) {
        log.info("[inicia] VendaInfraRepository - buscaVendasPorStatus");
        List<Venda> vendasPorStatus = this.vendaSpringDataJPARepository.findByStatusVenda(statusVenda);
        log.info("[finaliza] VendaInfraRepository - buscaVendasPorStatus");
        return vendasPorStatus;
    }
}
