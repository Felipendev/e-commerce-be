package usuario.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import usuario.application.service.UsuarioRepository;
import usuario.domain.Usuario;

@Repository
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {
	private final UsuarioSpringDataJPARepository usuarioSpringDataJPARepository;

	@Override
	public Usuario salva(Usuario usuario) {
		return usuarioSpringDataJPARepository.save(usuario);
	}
}
