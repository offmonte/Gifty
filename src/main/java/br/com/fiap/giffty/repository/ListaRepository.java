package br.com.fiap.giffty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.giffty.model.Lista;

public interface ListaRepository extends JpaRepository <Lista, Long> {
}
