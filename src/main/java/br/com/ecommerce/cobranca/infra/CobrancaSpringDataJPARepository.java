package br.com.ecommerce.cobranca.infra;

import br.com.ecommerce.cobranca.domain.Cobranca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface CobrancaSpringDataJPARepository extends JpaRepository<Cobranca, UUID> {
}
