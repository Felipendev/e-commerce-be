package br.com.ecommerce.venda.application.api;

import br.com.ecommerce.venda.application.service.VendasService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VendaController implements VendaApi {
    private final VendasService vendasService;

    @Override
    public VendaResponse postVenda(VendaRequest vendaRequest) {
        log.info("[inicia] VendaController - postVenda");
        VendaResponse venda = vendasService.criaVenda(vendaRequest);
        log.info("[finaliza] VendaController - postVenda");
        return venda;
    }

    @Override
    public List<VendaListResponde> getTodasVendas() {
        log.info("[inicia] VendaController - getTodasVendas");
        List<VendaListResponde> vendas = vendasService.buscaTodasVendas();
        log.info("[finaliza] VendaController - getTodasVendas");
        return vendas;
    }

    @Override
    public VendaDetalhadaResponse getVendaAtravesId(UUID idVenda) {
        log.info("[inicia] VendaController - getVendaAtravesId");
        VendaDetalhadaResponse vendaDetalhada = vendasService.buscaVendaAtravesId(idVenda);
        log.info("[finaliza] VendaController - getVendaAtravesId");
        return vendaDetalhada;
    }

    @Override
    public void pathAlteraVenda(UUID idVenda, VendaAlteracaoRequest vendaAlteracaoRequest) {
        log.info("[inicia] VendaController - pathAlteraVenda");
        log.info("[ID_VENDA] {}", idVenda);
        vendasService.pathAlteraVenda(idVenda, vendaAlteracaoRequest);
        log.info("[finaliza] VendaController - pathAlteraVenda");
    }

    @Override
    public void cancelamentoVenda(UUID idVenda) {
        log.info("[inicia] VendaController - postCancelamento");
        log.info("[ID_VENDA] {}", idVenda);
        vendasService.mudaStatusVendaParaCancelado(idVenda);
        log.info("[finaliza] VendaController - postCancelamento");
    }


}
