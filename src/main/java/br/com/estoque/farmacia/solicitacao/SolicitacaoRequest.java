package br.com.estoque.farmacia.solicitacao;

import br.com.estoque.farmacia.estoque.Insumo;
import br.com.estoque.farmacia.usuario.Usuario;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class SolicitacaoRequest {

    @NotNull
    private Long userId;
    @NotNull
    private Long insumoId;
    @Positive
    private Integer quantidade;



    public Long getUserId() {
        return userId;
    }


    public Long getInsumoId() {
        return insumoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Solicitacao toModel(Usuario usuario, Insumo insumo) {
        return new Solicitacao(usuario,insumo);
    }
}
