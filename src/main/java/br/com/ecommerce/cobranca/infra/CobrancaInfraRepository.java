package br.com.ecommerce.cobranca.infra;

import br.com.ecommerce.cobranca.application.api.CobrancaRequest;
import br.com.ecommerce.cobranca.application.repository.CobrancaRepository;
import br.com.ecommerce.cobranca.domain.Cobranca;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CobrancaInfraRepository implements CobrancaRepository {

    private final CobrancaSpringDataJPARepository cobrancaSpringDataJPARepository;
    @Override
    public Cobranca salvaCobranca(Cobranca cobranca) {
        log.info("[inicia] CobrancaInfraRepository - geraCobranca");
        cobrancaSpringDataJPARepository.save(cobranca);
        log.info("[finaliza] CobrancaInfraRepository - geraCobranca");
        return cobranca;
    }
}
