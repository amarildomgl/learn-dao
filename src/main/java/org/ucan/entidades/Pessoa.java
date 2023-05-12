package org.ucan.entidades;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Amarildo Miguel
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Pessoa {

    private int id;
    public String nome;
    public LocalDate data_nascimento;
    
    public Pessoa(String nome, LocalDate data_nascimento){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }
 
}
