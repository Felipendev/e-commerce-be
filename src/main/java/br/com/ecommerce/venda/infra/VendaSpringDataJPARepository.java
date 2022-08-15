package br.com.ecommerce.venda.infra;

import br.com.ecommerce.venda.domain.StatusVenda;
import br.com.ecommerce.venda.domain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;
public interface VendaSpringDataJPARepository extends JpaRepository<Venda, UUID> {
    List<Venda> findByStatusVenda(StatusVenda statusVenda);
}
