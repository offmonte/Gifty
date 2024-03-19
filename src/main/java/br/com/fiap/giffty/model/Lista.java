package br.com.fiap.giffty.model;

import br.com.fiap.giffty.validation.TipoLista;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data 
@Entity
public class Lista {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{lista.descricao.notblank}")
    @Size(min = 3, message = "{lista.descricao.size}")
    private String descricao;

    private String nome; 

    @TipoLista(message = "{lista.tipo.tipolista}")
    private String tipo; 
}
