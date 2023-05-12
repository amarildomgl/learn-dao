package org.ucan.conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Amarildo Miguel
 */


public interface IConexao {
/*
 * Nota:
 * Em Java, uma interface é uma coleção de métodos e constantes abstratas
 * (que não possuem implementação), que são usados para definir um conjunto de
 * comportamentos que uma classe deve implementar. As interfaces fornecem uma
 * forma de especificar um contrato entre diferentes partes de um programa,
 * permitindo que essas partes se comuniquem de forma mais genérica e flexível.
 */
    public void openConection() throws SQLException;

    public void closeConnection() throws SQLException;

    public Connection getConnection() throws SQLException;

}
