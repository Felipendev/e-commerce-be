package br.com.ecommerce.venda.application.api;

import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class VendaDetalhadaResponse {
    private UUID idVenda;
    private String nomeCliente;
    private Integer valorVenda;
    private LocalDateTime dataVenda;
    private StatusVenda statusVenda;

    public VendaDetalhadaResponse(Venda venda) {
        this.idVenda = venda.getIdVenda();
        this.nomeCliente = venda.getNomeCliente();
        this.valorVenda = venda.getValorVenda();
        this.dataVenda = venda.getDataVenda();
        this.statusVenda = venda.getStatusVenda();
    }
}
