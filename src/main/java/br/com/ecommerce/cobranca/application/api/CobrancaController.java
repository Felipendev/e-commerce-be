package br.com.ecommerce.cobranca.application.api;

import br.com.ecommerce.cobranca.application.service.CobrancaService;
import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;
import br.com.ecommerce.venda.application.service.VendasService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CobrancaController implements CobrancaApi {
    private final CobrancaService cobrancaService;

    @Override
    public CobrancaResponse postCobranca(UUID idVenda, CobrancaRequest cobrancaRequest) {
        log.info("[inicia] CobrancaController - postCobranca");
        CobrancaResponse cobranca = cobrancaService.geraCobranca(idVenda, cobrancaRequest);
        log.info("[finaliza] CobrancaController - postCobranca");
        return cobranca;
    }

}
