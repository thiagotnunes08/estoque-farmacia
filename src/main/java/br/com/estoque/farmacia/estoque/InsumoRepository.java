package br.com.estoque.farmacia.estoque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InsumoRepository extends JpaRepository<Insumo,Long> {
}
