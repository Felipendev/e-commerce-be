package br.com.ecommerce.cobranca.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
public interface CobrancaApi {

    @PostMapping(value = "/{idVenda}/cobranca")
    @ResponseStatus(code = HttpStatus.CREATED)
    CobrancaResponse postCobranca(@PathVariable UUID idVenda,  @RequestBody @Valid CobrancaRequest cobrancaRequest);
}
