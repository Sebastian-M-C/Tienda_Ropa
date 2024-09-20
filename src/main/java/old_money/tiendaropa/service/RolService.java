package old_money.tiendaropa.service;

import old_money.tiendaropa.model.Rol;
import old_money.tiendaropa.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Rol crearNuevoRol(Rol rol){
        return rolRepository.save(rol);
    }
}
