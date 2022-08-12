package br.com.ecommerce.venda.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class VendaController implements VendaApi {
    @Override
    public VendaResponse postVenda(VendaRequest vendaRequest) {
        log.info("[inicia] VendaController - postVenda");
        log.info("[finaliza] VendaController - postVenda");
        return null;
    }
}
