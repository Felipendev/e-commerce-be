package br.com.ecommerce.cobranca.domain;

import br.com.ecommerce.cobranca.application.api.CobrancaRequest;
import br.com.ecommerce.venda.application.api.VendaListResponse;
import br.com.ecommerce.venda.domain.Venda;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cobranca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCobranca;
    @NotNull
    @Column(columnDefinition = "uuid", name = "idVenda",  nullable = false)
    private UUID idVenda;
    @Enumerated(EnumType.STRING)
    private StatusCobranca statusCobranca;
    public Cobranca(UUID idVenda, CobrancaRequest cobrancaRequest) {
        this.idVenda = idVenda;
        this.statusCobranca = StatusCobranca.REALIZADA;
    }

    public Cobranca(Venda venda) {
        this.idVenda = idVenda;
    }

    public static List<Cobranca> converte(List<Venda> vendas) {
        return vendas.stream()
                .map(Cobranca::new)
                .collect(Collectors.toList());
    }
}
