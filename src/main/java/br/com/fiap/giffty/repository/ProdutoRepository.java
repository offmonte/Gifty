package br.com.fiap.giffty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.giffty.model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
