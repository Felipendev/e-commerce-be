package br.com.ecommerce.venda.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/venda")
public interface VendaApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VendaResponse postVenda(@RequestBody @Valid VendaRequest vendaRequest);
}
