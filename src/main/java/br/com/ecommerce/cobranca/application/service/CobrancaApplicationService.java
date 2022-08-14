package br.com.ecommerce.cobranca.application.service;

import br.com.ecommerce.cobranca.application.api.CobrancaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CobrancaApplicationService implements CobrancaService {

    @Override
    public CobrancaResponse geraCobranca(){
        log.info("[Inicia] CobrancaApplicationService - geraCobranca");
        log.info("[finaliza] CobrancaApplicationService - geraCobranca");
        return null;
    }
}
