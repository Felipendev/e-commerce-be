package br.com.ecommerce.venda.application.repository;

import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.domain.Venda;

public interface VendaRepository {

    Venda salva(Venda venda);
}
