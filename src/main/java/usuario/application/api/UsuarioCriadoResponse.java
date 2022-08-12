package usuario.application.api;

import lombok.Value;
import usuario.domain.Usuario;

import java.util.UUID;

@Value
public class UsuarioCriadoResponse {
	private final UUID idUsuario;
	private final String email;


	public UsuarioCriadoResponse(Usuario usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.email = usuario.getEmail();
	}
}
