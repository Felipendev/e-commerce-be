package br.com.ecommerce.venda.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class VendaResponse {
    private UUID idVenda;
}
