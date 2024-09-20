package old_money.tiendaropa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //Ruta principal el root  |||    index == /
    public String home(){
        return "index";
    }
}
