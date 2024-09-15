package br.com.estoque.farmacia.usuario;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class NovoUsuarioControllerr {

    public NovoUsuarioControllerr(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    private final UsuarioRepository usuarioRepository;
    @PostMapping
    public void cadastra(@RequestBody @Valid UsuarioRequest request){

        var usuarrio = request.toModel();

        usuarioRepository.save(usuarrio);
    }
}
