package br.com.fiap.griffty.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import br.com.fiap.griffty.model.Produto;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller

public class ProdutoController {

    Logger log = LoggerFactory.getLogger(getClass());

    List <Produto> listas = new ArrayList<>();
    
    @RequestMapping( path = "/produtos", method=RequestMethod.GET, produces = "application/json" )
    @ResponseBody
    public List <Produto> index() {
        return listas;
    }

    @RequestMapping( path = "/produtos", method=RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public void criar (@RequestBody Produto produto) {
        log.info("cadastrando produto: {}", produto);
        listas.add(produto);
    }
    
    

    







    
}
