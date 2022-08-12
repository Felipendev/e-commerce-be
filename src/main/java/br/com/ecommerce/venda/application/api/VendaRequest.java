package br.com.ecommerce.venda.application.api;

import br.com.ecommerce.venda.domain.StatusVenda;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Value
public class VendaRequest {
    @NotBlank
    private String nomeCliente;
    private Integer valorVenda;
    @NotNull
    private LocalDateTime dataVenda;
    @NotNull
    private StatusVenda statusVenda;
}
