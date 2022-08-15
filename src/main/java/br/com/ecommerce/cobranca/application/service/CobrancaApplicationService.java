package br.com.ecommerce.cobranca.application.service;

import br.com.ecommerce.cobranca.application.api.CobrancaRequest;
import br.com.ecommerce.cobranca.application.api.CobrancaResponse;
import br.com.ecommerce.cobranca.application.repository.CobrancaRepository;
import br.com.ecommerce.cobranca.domain.Cobranca;
import br.com.ecommerce.venda.application.service.VendasService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class CobrancaApplicationService implements CobrancaService {

    private final VendasService vendasService;
    private final CobrancaRepository cobrancaRepository;

    @Override
    public CobrancaResponse geraCobranca(UUID idVenda, CobrancaRequest cobrancaRequest){
        log.info("[Inicia] CobrancaApplicationService - geraCobranca");
        log.info("[ID_VENDA] {}", idVenda);
        vendasService.buscaVendaAtravesId(idVenda);
        Cobranca cobranca = cobrancaRepository.salvaCobranca(new Cobranca(idVenda, cobrancaRequest));
        log.info("[finaliza] CobrancaApplicationService - geraCobranca");
        return new CobrancaResponse(cobranca.getIdCobranca());
    }
}
