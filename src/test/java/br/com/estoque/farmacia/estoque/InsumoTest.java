package br.com.estoque.farmacia.estoque;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class InsumoTest {
    @Test
    void devBaixarEstoque() {
        var insumo = new Insumo("Dipirona", 30);
        insumo.baixaEstoque(30);
        Assertions.assertEquals(0, insumo.getQuantidade());
    }

    @Test
    void deveDarErroAoBaixaMaiorQtdadeEstoque() {
        var insumo = new Insumo("Dipirona", 30);
        Assertions.assertThrows(RuntimeException.class,()-> insumo.baixaEstoque(100));
    }

}