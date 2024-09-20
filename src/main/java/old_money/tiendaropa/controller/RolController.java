package old_money.tiendaropa.controller;

import old_money.tiendaropa.model.Rol;
import old_money.tiendaropa.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping({"/createNewRole"})
    public Rol crearNuevoRol(@RequestBody Rol rol){
        return rolService.crearNuevoRol(rol);
    }
}
