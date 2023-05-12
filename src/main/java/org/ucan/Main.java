package org.ucan;

import org.ucan.conexao.Conexao;
import org.ucan.entidades.Pessoa;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {

        Pessoa pessoa = new Pessoa("Pessoa Exemplo", LocalDate.of(2023, 5, 12));
        String sql = "INSERT INTO pessoas (nome, data_nascimento) VALUES (?, ?)";
        Conexao conexao = new Conexao();
        try {
            conexao.openConection();
            conexao.executarConsultaPreparada(sql, pessoa.getNome(), pessoa.getData_nascimento());
            System.out.println(pessoa + "INSERIDO COM SUCESSO");    

        } catch (SQLException e) {
            System.err.println("Error: " + e);
            conexao.closeConnection();
            return;
        }

    }
}