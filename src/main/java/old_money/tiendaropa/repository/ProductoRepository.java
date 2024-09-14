package old_money.tiendaropa.repository;

import old_money.tiendaropa.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
