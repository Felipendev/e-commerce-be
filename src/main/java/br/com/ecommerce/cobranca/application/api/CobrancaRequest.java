package br.com.ecommerce.cobranca.application.api;

import br.com.ecommerce.cobranca.domain.StatusCobranca;
import lombok.Getter;

@Getter
public class CobrancaRequest {
    private StatusCobranca statusCobranca;
}
