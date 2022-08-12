package usuario.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import usuario.application.api.UsuarioNovoRequest;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idUsuario;
	@Email
	@Column(unique = true)
	private String email;

	public Usuario(UsuarioNovoRequest usuarioNovo) {
		this.idUsuario = UUID.randomUUID();
		this.email = usuarioNovo.getEmail();
	}
}
