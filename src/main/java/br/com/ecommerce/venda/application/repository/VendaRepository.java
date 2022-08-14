package br.com.ecommerce.venda.application.repository;

import br.com.ecommerce.venda.domain.Venda;

import java.util.List;
import java.util.UUID;

public interface VendaRepository {

    Venda salva(Venda venda);

    List<Venda> buscaTodasVendas();
    Venda buscaVendaAtravesId(UUID idVenda);
}
