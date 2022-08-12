package usuario.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import usuario.domain.Usuario;

import java.util.UUID;

public interface UsuarioSpringDataJPARepository extends JpaRepository<Usuario, UUID> {

    Usuario save(Usuario usuario);
}
