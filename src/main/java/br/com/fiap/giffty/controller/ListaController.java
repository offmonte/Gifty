package br.com.fiap.giffty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.giffty.model.Lista;
import br.com.fiap.giffty.repository.ListaRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("lista")
public class ListaController {

    @Autowired
    private ListaRepository listaRepository;

    @PostMapping 
    public Lista create(@Valid @RequestBody Lista lista) {
        return listaRepository.save(lista);
    }
    
}
