package br.com.ecommerce.cobranca.application.api;

import br.com.ecommerce.cobranca.domain.StatusCobranca;
import lombok.Value;

@Value
public class CobrancaRequest {
    private StatusCobranca statusCobranca;
}
