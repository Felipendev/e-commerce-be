package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.VendaDetalhadaResponse;
import br.com.ecommerce.venda.application.api.VendaListResponde;
import br.com.ecommerce.venda.application.api.VendaRequest;
import br.com.ecommerce.venda.application.api.VendaResponse;

import java.util.List;
import java.util.UUID;

public interface VendasService {
    VendaResponse criaVenda(VendaRequest vendaRequest);
    List<VendaListResponde> buscaTodasVendas();
    VendaDetalhadaResponse buscaVendaAtravesId(UUID idVenda);
}
