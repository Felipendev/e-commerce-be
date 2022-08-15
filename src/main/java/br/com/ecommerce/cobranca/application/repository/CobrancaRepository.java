package br.com.ecommerce.cobranca.application.repository;

import br.com.ecommerce.cobranca.application.api.CobrancaRequest;
import br.com.ecommerce.cobranca.domain.Cobranca;

import java.util.UUID;

public interface CobrancaRepository {

    Cobranca salvaCobranca(Cobranca cobranca);
}
