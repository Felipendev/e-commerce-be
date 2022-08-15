package br.com.ecommerce.cobranca.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class CobrancaResponse {
    private UUID idCobranca;
}
