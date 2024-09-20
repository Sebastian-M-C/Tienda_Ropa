package old_money.tiendaropa.controller;

import jakarta.validation.Valid;
import old_money.tiendaropa.dto.UsuarioDto;
import old_money.tiendaropa.model.Usuario;
import old_money.tiendaropa.repository.UsuarioRepository;
import old_money.tiendaropa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping({"", "/"})
    public String getUsuarios(Model model){
        var usuarios = usuarioRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
        model.addAttribute("usuarios", usuarios);
        return "usuarios/index";
    }

    @GetMapping("/create")
    public String createUsers(Model model){
        UsuarioDto usuarioDto = new UsuarioDto();
        model.addAttribute("usuarioDto", usuarioDto);

        return "usuarios/create";
    }

    @PostMapping("/create")
    public String createClient(
            @Valid @ModelAttribute UsuarioDto usuarioDto,
            BindingResult result
    ){
        if (usuarioRepository.findByEmail(usuarioDto.getEmail()) != null) {
            result.addError(
                    new FieldError("clientDto", "email", usuarioDto.getEmail(),
                            false, null, null, "Email address is already used")
            );
        }
        if(result.hasErrors()){
            return "usuarios/create";
        }

        Usuario usuario = new Usuario();
        usuario.setFirstName(usuarioDto.getFirstName());
        usuario.setLastName(usuarioDto.getLastName());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setStatus(usuarioDto.getStatus());
        usuario.setCreateAt(new Date());

        usuarioRepository.save(usuario);

        return "redirect:/usuarios";
    }

    @GetMapping("/edit/{id}")
    public String editClient(Model model, @PathVariable Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return "redirect:/usuarios";
        }

        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setFirstName(usuario.getFirstName());
        usuarioDto.setLastName(usuario.getLastName());
        usuarioDto.setEmail(usuario.getEmail());
        usuarioDto.setStatus(usuario.getStatus());

        model.addAttribute("usuario", usuario);
        model.addAttribute("usuarioDto", usuarioDto);

        return "usuarios/edit";
    }



    @PostMapping("/edit/{id}")
    public String editClient(
            Model model,
            @PathVariable Long id,
            @Valid @ModelAttribute UsuarioDto usuarioDto,
            BindingResult result
    ) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return "redirect:/usuarios";
        }

        model.addAttribute("usuario", usuario);

        if (result.hasErrors()) {
            return "usuarios/edit";
        }

        // Actualiza los datos del usuario
        usuario.setFirstName(usuarioDto.getFirstName());
        usuario.setLastName(usuarioDto.getLastName());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setStatus(usuarioDto.getStatus());

        try {
            usuarioRepository.save(usuario);
        } catch (Exception ex) {
            result.addError(
                    new FieldError("usuarioDto", "email", usuarioDto.getEmail(),
                            false, null, null, "Email address is already used")
            );
            return "usuarios/edit";
        }

        return "redirect:/usuarios";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam Long id){
        Usuario usuario = usuarioRepository.findById(id).orElse(null);

        if(usuario != null) {
            usuarioRepository.delete(usuario);
        }

        return "redirect:/usuarios";
    }




}
