package org.ucan.conexao;

import java.sql.Statement;

import javax.lang.model.type.NullType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amarildo Miguel
 */
public class Conexao implements IConexao {

    /*  Nota:
     * 
     * Uma variável estática em Java é uma variável que pertence à classe,
     * em vez de pertencer a uma instância específica dessa classe.
     * Isso significa que, independentemente de quantas instâncias da classe sejam
     * criadas, a variável estática será compartilhada entre todas elas.
     */
    private static Connection conexao;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private final String DATA_SOURCE = "jdbc:postgresql://localhost:5432/testes";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "postgres";

    public Conexao() {
    }

    @Override
    public void openConection() throws SQLException {
        conexao = DriverManager.getConnection(DATA_SOURCE, USERNAME, PASSWORD);
        statement = conexao.createStatement();
    }

    @Override
    public void closeConnection() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (conexao != null) {
            conexao.close();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return conexao;
    }

    public ResultSet executarConsulta(String consulta) throws SQLException {
        resultSet = statement.executeQuery(consulta);
        return resultSet;
    }

    public ResultSet executarConsultaPreparada(String consulta, Object... parametros) throws SQLException {
        preparedStatement = conexao.prepareStatement(consulta);
        for (int i = 0; i < parametros.length; i++) {
            preparedStatement.setObject(i + 1, parametros[i]);
        }
        resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public int executarAtualizacao(String atualizacao) throws SQLException {
        return statement.executeUpdate(atualizacao);
    }

    public int executarAtualizacaoPreparada(String atualizacao, Object... parametros) throws SQLException {
        preparedStatement = conexao.prepareStatement(atualizacao);
        for (int i = 0; i < parametros.length; i++) {
            preparedStatement.setObject(i + 1, parametros[i]);
        }
        return preparedStatement.executeUpdate();
    }

}
