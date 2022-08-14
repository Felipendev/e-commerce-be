package br.com.ecommerce.venda.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/venda")
public interface VendaApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VendaResponse postVenda(@RequestBody @Valid VendaRequest vendaRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<VendaListResponde> getTodasVendas();

    @GetMapping(value = "/{idVenda}")
    @ResponseStatus(code = HttpStatus.OK)
    VendaDetalhadaResponse getVendaAtravesId(@PathVariable UUID idVenda);

    @PatchMapping(value = "/{idVenda}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void pathAlteraVenda(@PathVariable UUID idVenda, @RequestBody @Valid VendaAlteracaoRequest vendaAlteracaoRequest);
}
