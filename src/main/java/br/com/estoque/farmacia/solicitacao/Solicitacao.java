package br.com.estoque.farmacia.solicitacao;

import br.com.estoque.farmacia.estoque.Insumo;
import br.com.estoque.farmacia.usuario.Usuario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Insumo insumo;
    private LocalDateTime solicitadoEm;

    public Solicitacao(Usuario usuario,Insumo insumo) {
        this.usuario = usuario;
        this.insumo = insumo;
        this.solicitadoEm = LocalDateTime.now();
    }
}
