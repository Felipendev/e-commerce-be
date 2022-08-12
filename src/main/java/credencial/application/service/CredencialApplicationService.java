package credencial.application.service;

import credencial.domain.Credencial;
import usuario.application.api.UsuarioNovoRequest;

import javax.validation.Valid;

public interface CredencialApplicationService {
	void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
	Credencial buscaCredencialPorUsuario(String usuario);
}
