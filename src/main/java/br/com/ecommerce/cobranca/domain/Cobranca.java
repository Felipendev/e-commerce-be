package br.com.ecommerce.cobranca.domain;

import br.com.ecommerce.cobranca.application.api.CobrancaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cobranca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCobranca;
    @Enumerated(EnumType.STRING)
    private StatusCobranca statusCobranca;

    public Cobranca(CobrancaRequest cobrancaRequest) {
        this.statusCobranca = cobrancaRequest.getStatusCobranca();
    }
}
