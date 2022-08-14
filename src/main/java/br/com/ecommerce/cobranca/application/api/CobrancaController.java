package br.com.ecommerce.cobranca.application.api;

import br.com.ecommerce.cobranca.application.service.CobrancaService;
import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CobrancaController implements CobrancaApi {
    private final CobrancaService cobrancaService;

    @Override
    public CobrancaResponse postCobranca() {
        log.info("[inicia] CobrancaController - postCobranca");
        CobrancaResponse cobrancaResponse = cobrancaService.geraCobranca();
        log.info("[finaliza] CobrancaController - postCobranca");
        return null;
    }
}
