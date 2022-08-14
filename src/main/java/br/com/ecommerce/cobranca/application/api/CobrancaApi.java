package br.com.ecommerce.cobranca.application.api;

import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/cobranca")
public interface CobrancaApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CobrancaResponse postCobranca();
}
