package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.VendaListResponde;
import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;
import br.com.ecommerce.venda.application.repository.VendaRepository;
import br.com.ecommerce.venda.domain.Venda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class VendasApplicationService implements VendasService {
    private final VendaRepository vendaRepository;

    @Override
    public VendaResponse criaVenda(VendaRequest vendaRequest) {
        log.info("[inicia] VendasApplicationService - criaVenda");
        Venda venda = vendaRepository.salva(new Venda(vendaRequest));
        log.info("[finaliza] VendasApplicationService - criaVenda");
        return VendaResponse.builder().idVenda(venda.getIdVenda()).build();
    }

    @Override
    public List<VendaListResponde> buscaTodasVendas() {
        log.info("[inicia] VendasApplicationService - buscaTodasVendas");
        List<Venda> vendas = vendaRepository.buscaTodasVendas();
        log.info("[finaliza] VendasApplicationService - buscaTodasVendas");
        return VendaListResponde.converte(vendas);
    }
}
