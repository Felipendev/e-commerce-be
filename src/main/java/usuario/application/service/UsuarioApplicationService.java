package usuario.application.service;

import usuario.application.api.UsuarioCriadoResponse;
import usuario.application.api.UsuarioNovoRequest;

import javax.validation.Valid;

public interface UsuarioApplicationService {
	UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
}
