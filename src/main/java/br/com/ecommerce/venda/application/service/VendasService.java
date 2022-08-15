package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.*;
import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;

import java.util.List;
import java.util.UUID;

public interface VendasService {
    VendaResponse criaVenda(VendaRequest vendaRequest);
    List<VendaListResponse> buscaTodasVendas();
    VendaDetalhadaResponse buscaVendaAtravesId(UUID idVenda);
    void pathAlteraVenda(UUID idVenda, VendaAlteracaoRequest vendaAlteracaoRequest);
    void mudaStatusVendaParaCancelado(UUID idVenda);
    List<VendaPorStatusResponse> listaVendasEmAbertoAtravesStatus();
}
