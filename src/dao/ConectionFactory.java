/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author douglas
 */
/**public class ConectionFactory {

    public static Connection Conexao() {
        try {

            String url = "jdbc:postgresql://localhost:5432/petshop";
            String usuario = "postgres";
            String senha = "postgres";

            Class.forName("org.postgresql.Driver");

            Connection con;

            con = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão realizada com sucesso.");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}**/

public class ConectionFactory {
    private static final String URL_POSTGRESSQL = "jdbc:postgresql://localhost:5432/petshop";
    private static final String DRIVER_CLASS_POSTGRESSQL = "org.postgresql.Driver";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    public static Connection Conexao() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            Class.forName(DRIVER_CLASS_POSTGRESSQL);
            return DriverManager.getConnection(URL_POSTGRESSQL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (conn!= null) {
                conn.close();
            }

            if (stmt!= null) {
                stmt.close();
            }

            if (rs!= null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable() {
        Connection connection = Conexao();
        PreparedStatement stmt = null;
        String sql = "CREATE TABLE IF NOT EXISTS cliente (" +
                "  ID SERIAL PRIMARY KEY," +
                "  NOME VARCHAR(255) NOT NULL," +
                "  CPF CHARACTER(15) NOT NULL," +
                "  CELULAR CHARACTER(15)," +
                "  TELEFONE CHARACTER(15)," +
                "  LOGRADOURO VARCHAR(255)," +
                "  NUMERO CHARACTER(15)," +
                "  BAIRRO VARCHAR(255)," +
                "  CIDADE VARCHAR(255)," +
                "  ESTADO VARCHAR(255)" +
                ");";
        
        String sql2 = "CREATE TABLE IF NOT EXISTS estoque (" +
                "  ID SERIAL PRIMARY KEY," +
                "  NOME VARCHAR(255) NOT NULL," +
                "  QUANTIDADE VARCHAR(20) NOT NULL" +
                ");";
        
        String sql3 = "CREATE TABLE IF NOT EXISTS agenda (" +
                "  ID SERIAL PRIMARY KEY," +
                "  DATA DATE," +
                "  HORARIO CHARACTER(5)," +
                "  CLIENTE_ID INTEGER," +
                "  SERVICO_ID INTEGER" +
                ");";
                
        try {
            stmt = connection.prepareStatement(sql);
            stmt.execute();
            System.out.println("Create Tables Ok!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, stmt, null);
        }
    }
}
