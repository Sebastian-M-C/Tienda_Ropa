package old_money.tiendaropa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping
    public String HolaMundo(){
        return "hola";
    }
}
