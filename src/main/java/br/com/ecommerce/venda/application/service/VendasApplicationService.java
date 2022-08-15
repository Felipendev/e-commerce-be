package br.com.ecommerce.venda.application.service;

import br.com.ecommerce.venda.application.api.*;
import br.com.ecommerce.venda.application.repository.VendaRepository;
import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class VendasApplicationService implements VendasService {
    private final VendaRepository vendaRepository;

    @Override
    public VendaResponse criaVenda(VendaRequest vendaRequest) {
        log.info("[inicia] VendasApplicationService - criaVenda");
        Venda venda = vendaRepository.salva(new Venda(vendaRequest));
        log.info("[finaliza] VendasApplicationService - criaVenda");
        return VendaResponse.builder().idVenda(venda.getIdVenda()).build();
    }

    @Override
    public List<VendaListResponse> buscaTodasVendas() {
        log.info("[inicia] VendasApplicationService - buscaTodasVendas");
        List<Venda> vendas = vendaRepository.buscaTodasVendas();
        log.info("[finaliza] VendasApplicationService - buscaTodasVendas");
        return VendaListResponse.converte(vendas);
    }

    @Override
    public List<VendaPorStatusResponse> listaVendasEmAbertoAtravesStatus() {
        log.info("[inicia] VendasApplicationService - listaVendasEmAbertoAtravesStatus");
        List<Venda> vendasPorStatus = vendaRepository.findByStatusVenda(StatusVenda.ABERTA);
        log.info("[finaliza] VendasApplicationService - listaVendasEmAbertoAtravesStatus");
        return VendaPorStatusResponse.converte(vendasPorStatus);
    }

    @Override
    public VendaDetalhadaResponse buscaVendaAtravesId(UUID idVenda) {
        log.info("[inicia] VendasApplicationService - buscaVendaAtravesId");
        Venda venda = vendaRepository.buscaVendaAtravesId(idVenda);
        log.info("[finaliza] VendasApplicationService - buscaVendaAtravesId");
        return new VendaDetalhadaResponse(venda);
    }

    @Override
    public void pathAlteraVenda(UUID idVenda, VendaAlteracaoRequest vendaAlteracaoRequest) {
        log.info("[inicia] VendasApplicationService - pathAlteraVenda");
        Venda venda = vendaRepository.buscaVendaAtravesId(idVenda);
        venda.altera(vendaAlteracaoRequest);
        vendaRepository.salva(venda);
        log.info("[finaliza] VendasApplicationService - pathAlteraVenda");
    }

    @Override
    public void mudaStatusVendaParaCancelado(UUID idVenda) {
        log.info("[inicia] VendasApplicationService - postMudaStatusParaCancelado");
        Venda venda = vendaRepository.buscaVendaAtravesId(idVenda);
        venda.cancela();
        vendaRepository.salva(venda);
        log.info("[finaliza] VendasApplicationService - postMudaStatusParaCancelado");
    }
}
