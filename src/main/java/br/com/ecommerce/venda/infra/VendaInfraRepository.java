package br.com.ecommerce.venda.infra;

import br.com.ecommerce.venda.application.repository.VendaRepository;
import br.com.ecommerce.venda.domain.Venda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VendaInfraRepository implements VendaRepository {
    private final VendaSpringDataJPARepository vendaSpringJPARepository;
    @Override
    public Venda salva(Venda venda) {
        log.info("[inicia] VendaInfraRepository - salva");
        vendaSpringJPARepository.save(venda);
        log.info("[finaliza] VendaInfraRepository - salva");
        return venda;
    }
}
