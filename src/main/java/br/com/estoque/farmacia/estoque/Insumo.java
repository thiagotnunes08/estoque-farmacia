package br.com.estoque.farmacia.estoque;


import jakarta.persistence.*;

@Entity
public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer quantidade;


    public Insumo(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade=quantidade;
    }

    public void baixaEstoque(Integer quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }
    /**
     * @deprecated uso hibernate
     */
    @Deprecated
    public Insumo() {
    }
}
