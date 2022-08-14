package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.VendaListResponde;
import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;

import java.util.List;

public interface VendasService {
    VendaResponse criaVenda(VendaRequest vendaRequest);
    List<VendaListResponde> buscaTodasVendas();
}
