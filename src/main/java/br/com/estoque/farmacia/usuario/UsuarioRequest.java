package br.com.estoque.farmacia.usuario;

import jakarta.validation.constraints.NotBlank;

public class UsuarioRequest {

    @NotBlank
    private String nome;

    public String getNome() {
        return nome;
    }

    public Usuario toModel() {
        return new Usuario(nome);
    }
}
