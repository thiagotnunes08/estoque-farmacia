package br.com.estoque.farmacia.usuario;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    /**
     * @deprecated uso hibernate
     */
    @Deprecated
    public Usuario() {
    }
}
