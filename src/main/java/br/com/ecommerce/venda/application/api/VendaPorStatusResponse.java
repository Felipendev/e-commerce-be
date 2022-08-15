package br.com.ecommerce.venda.application.api;

import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Value
public class VendaPorStatusResponse {
    private String nomeCliente;
    private Integer valorVenda;
    private LocalDateTime dataVenda;
    private StatusVenda statusVenda;

    public VendaPorStatusResponse(Venda venda) {
        this.nomeCliente = venda.getNomeCliente();
        this.valorVenda = venda.getValorVenda();
        this.dataVenda = venda.getDataVenda();
        this.statusVenda = venda.getStatusVenda();
    }
    public static List<VendaPorStatusResponse> converte(List<Venda> vendasPorStatus) {
        return vendasPorStatus.stream().map(VendaPorStatusResponse::new).collect(Collectors.toList());
    }
}
