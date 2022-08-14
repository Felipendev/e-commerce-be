package br.com.ecommerce.venda.application.api;

import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class VendaListResponde {
    private UUID idVenda;
    private String nomeCliente;
    private Integer valorVenda;
    private LocalDateTime dataVenda;
    private StatusVenda statusVenda;

    public static List<VendaListResponde> converte(List<Venda> vendas) {
        return vendas.stream()
                .map(VendaListResponde::new)
                .collect(Collectors.toList());
    }

    public VendaListResponde(Venda venda) {
        this.idVenda = venda.getIdVenda();
        this.nomeCliente = venda.getNomeCliente();
        this.valorVenda = venda.getValorVenda();
        this.dataVenda = venda.getDataVenda();
        this.statusVenda = venda.getStatusVenda();
    }
}
