package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.*;

import java.util.List;
import java.util.UUID;

public interface VendasService {
    VendaResponse criaVenda(VendaRequest vendaRequest);
    List<VendaListResponde> buscaTodasVendas();
    VendaDetalhadaResponse buscaVendaAtravesId(UUID idVenda);
    void pathAlteraVenda(UUID idVenda, VendaAlteracaoRequest vendaAlteracaoRequest);
}
