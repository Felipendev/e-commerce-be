package credencial.application.service;

import credencial.application.repository.CredencialRepository;
import credencial.domain.Credencial;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import usuario.application.api.UsuarioNovoRequest;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
@Log4j2
public class CrendencialService implements CredencialApplicationService {
	private final CredencialRepository credencialRepository;
	
	@Override
	public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] CrendencialService - criaNovaCredencial");
		var novaCredencial = new Credencial(usuarioNovo.getEmail(), usuarioNovo.getSenha());
		credencialRepository.salva(novaCredencial);
		log.info("[finish] CrendencialService - criaNovaCredencial");
	}
	
	@Override
	public Credencial buscaCredencialPorUsuario(String usuario) {
		log.info("[inicia] CredencialSpringDataJpaService - buscaCredencial");
		Credencial credencial = credencialRepository.buscaCredencialPorUsuario(usuario);
		log.info("[finaliza] CredencialSpringDataJpaService - buscaCredencial");
		return credencial;
	}
}
