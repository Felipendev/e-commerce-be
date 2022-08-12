package br.com.ecommerce.venda.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name = "id", updatable = false, unique = true, nullable = false)
    private UUID idVenda;
    @NotBlank
    private String nomeCliente;
    private Integer valorVenda;
    @NotNull
    private LocalDateTime dataVenda;
    @Enumerated(EnumType.STRING)
    @NotNull
    private StatusVenda statusVenda;
}
