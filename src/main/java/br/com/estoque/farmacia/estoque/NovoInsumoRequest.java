package br.com.estoque.farmacia.estoque;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class NovoInsumoRequest {
    @NotBlank
    private String nome;
    @Positive
    private Integer quantidade;

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Insumo toModel() {
        return new Insumo(nome,quantidade);
    }
}
