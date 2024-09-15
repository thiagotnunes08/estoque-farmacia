package br.com.estoque.farmacia.estoque;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estoque")
public class NovoInsumoController {

    public NovoInsumoController(InsumoRepository repository) {
        this.repository = repository;
    }

    private final InsumoRepository repository;
    @PostMapping
    public void cadastra(@RequestBody @Valid NovoInsumoRequest request){


        var insumo = request.toModel();

        repository.save(insumo);

    }
}
