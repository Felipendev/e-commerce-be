package br.com.ecommerce.cobranca.application.service;

import br.com.ecommerce.cobranca.application.api.CobrancaRequest;
import br.com.ecommerce.cobranca.application.api.CobrancaResponse;

import java.util.UUID;

public interface CobrancaService  {
    CobrancaResponse geraCobranca(UUID idVenda, CobrancaRequest cobrancaRequest);
}
