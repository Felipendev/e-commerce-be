package br.com.ecommerce.venda.application.repository;

import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.domain.Venda;

import java.util.List;

public interface VendaRepository {

    Venda salva(Venda venda);

    List<Venda> buscaTodasVendas();
}
