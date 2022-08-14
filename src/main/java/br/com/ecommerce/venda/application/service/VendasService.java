package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;

public interface VendasService {
    VendaResponse criaVenda(VendaRequest vendaRequest);
}
