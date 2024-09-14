package old_money.tiendaropa.service;

import old_money.tiendaropa.model.Usuario;
import old_money.tiendaropa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired //esta anotacion inyecta todo del repositorio
    private UsuarioRepository usuarioRepository;

    //obtener todos los usuarios por lista
    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioRepository.findAll(); //llama al metodo del repositorio
    }

    //obtener un usuario por ID, optional significa que busca si existe o
    // no el dato de valor null
    public Optional<Usuario> ObtenerUsuarioPorId(Long id){
        return usuarioRepository.findById(id);
    }

    //Crear un usuario nuevo
    public Usuario crearNuevoUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //eliminar un usuario por Id
    public void eliminarUsuarioPorId(Long id){
        usuarioRepository.deleteById(id);
    }
}
