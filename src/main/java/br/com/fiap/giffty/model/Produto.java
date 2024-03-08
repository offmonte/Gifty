package br.com.fiap.giffty.model;

import java.util.Random;

public record Produto (Long id, String nome, String icone, String link, String descricao){

    public Produto(Long id, String nome, String icone, String link, String descricao){
        var key = (id != null) ? id : Math.abs( new Random().nextLong() );
        this.id = key;
        this.icone = icone;
        this.nome = nome;
        this.link = link;
        this.descricao = descricao;
    }
}

