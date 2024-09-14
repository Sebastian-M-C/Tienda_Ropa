package old_money.tiendaropa.repository;

import old_money.tiendaropa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //ver un videito de como funciona el repositorio en spring boot


}
