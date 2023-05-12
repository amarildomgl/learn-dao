package org.ucan;

import org.ucan.entidades.Pessoa;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa amarildo = new Pessoa("Amarildo Miguel", LocalDate.of(1999, 2, 24));
        System.out.println(amarildo);
    }
}