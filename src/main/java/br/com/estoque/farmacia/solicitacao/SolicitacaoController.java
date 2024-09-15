package br.com.estoque.farmacia.solicitacao;

import br.com.estoque.farmacia.estoque.Insumo;
import br.com.estoque.farmacia.estoque.InsumoRepository;
import br.com.estoque.farmacia.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("solicitacao")
public class SolicitacaoController {
    private final UsuarioRepository usuarioRepository;
    private final InsumoRepository insumoRepository;

    private final SolicitacaoRepository solicitacaoRepository;

    public SolicitacaoController(UsuarioRepository usuarioRepository, InsumoRepository insumoRepository, SolicitacaoRepository solicitacaoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.insumoRepository = insumoRepository;
        this.solicitacaoRepository = solicitacaoRepository;
    }

    @PostMapping
    public void solicita(@RequestBody @Valid SolicitacaoRequest request){

        var posssivelUsuario = usuarioRepository.findById(request.getUserId());

        if (posssivelUsuario.isEmpty()){
            throw new RuntimeException("usuário nao cadasrao no sistema!!");
        }

        var posssivelInnsumo = insumoRepository.findById(request.getInsumoId());

        if (posssivelInnsumo.isEmpty()){
            throw new RuntimeException("usuário nao cadasrao no sistema!!");
        }

        var insumo = posssivelInnsumo.get();

        insumo.baixaEstoque(request.getQuantidade());

        var usuario = posssivelUsuario.get();

        var novaSolicitacao = request.toModel(usuario,insumo);

        solicitacaoRepository.save(novaSolicitacao);

    }
}
