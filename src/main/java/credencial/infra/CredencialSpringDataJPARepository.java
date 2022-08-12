package credencial.infra;

import credencial.domain.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredencialSpringDataJPARepository extends JpaRepository<Credencial, String> {
	Optional<Credencial> findByUsuario(String usuario);
}
