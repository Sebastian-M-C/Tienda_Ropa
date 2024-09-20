package old_money.tiendaropa;

import old_money.tiendaropa.model.Rol;
import old_money.tiendaropa.model.Usuario;
import old_money.tiendaropa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Collections;

@SpringBootApplication
public class TiendaRopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaRopaApplication.class, args);
    }


}
