package br.com.fiap.giffty.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.giffty.model.Produto;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Produto> repository = new ArrayList<>();

    @GetMapping
    public List<Produto> index() {
        return repository;
    }

    @PostMapping
    // @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        log.info("cadastrando produto: {}", produto);
        repository.add(produto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(produto);
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> get(@PathVariable Long id) {
        log.info("Buscar por id: {}", id);

        var optionalProduto = buscarProdutoPorId(id);

        if (optionalProduto.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(optionalProduto.get());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id) {
        log.info("apagando produto {}", id);

        var optionalProduto = buscarProdutoPorId(id);

        if (optionalProduto.isEmpty())
            return ResponseEntity.notFound().build();

        repository.remove(optionalProduto.get());

        return ResponseEntity.noContent().build();

    }

    @PutMapping("{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody Produto produto){
        log.info("atualizando produto id {} para {}", id, produto);
        
        var optionalProduto = buscarProdutoPorId(id);

        if (optionalProduto.isEmpty())
            return ResponseEntity.notFound().build();

        var produtoEncontrada = optionalProduto.get();
        var produtoAtualizada = new Produto(id, produto.nome(), produto.icone(), produto.link(), produto.descricao());
        repository.remove(produtoEncontrada);
        repository.add(produtoAtualizada);

        return ResponseEntity.ok().body(produtoAtualizada);
    }

    private Optional<Produto> buscarProdutoPorId(Long id) {
        var optionalProduto = repository
                .stream()
                .filter(c -> c.id().equals(id))
                .findFirst();
        return optionalProduto;
    }
    

    







    
}
