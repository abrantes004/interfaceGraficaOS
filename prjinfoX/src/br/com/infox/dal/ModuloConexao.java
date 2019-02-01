/*
 * Data Access Layer
 * 
 * 
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Gustavo Santos
 */
public class ModuloConexao {
    //método responsável por estabelecer conexão com banco de dados.

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver importado
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox"; //conexão com nome e end. do banco de dados
        String user = "root"; //login do banco de dados
        String password = ""; //senha do banco de dados "s/senha"
        //Estabelecendo conex'ao com banco de dados
        try { //caso de certo faça
            Class.forName(driver);// executa o arquivo do driver
            conexao = DriverManager.getConnection(url,user, password); //variavel criada mais acima
            return conexao; //retorna a conexao
            //tudo acima tem haver com gerenciamento do driver para obter coneção
        } catch (Exception e) { //caso ocorra erro faça
            //a linha abaixo exibe o erro caso banco de dados nao funcione
            //System.out.println(e);
            return null; 
        }

    }
}
