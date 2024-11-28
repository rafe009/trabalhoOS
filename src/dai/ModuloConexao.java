/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dai;

import java.sql.*;

/**
 *
 * @author rafae
 */
public class ModuloConexao {
    //método responsavel por estabelecer a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //a linha abaixo chama o Driver do postgres
        String driver = "org.postgresql.Driver";
        //armazenando informações do banco
        String url = "jdbc:postgresql://localhost:5432/software_473";
        String user = "postgres";
        String password = "1234";
        //estabelecendo conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user, password);
            return conexao;
        } catch (Exception e) {
           // System.out.println(e); não vai para o usuario final pois é um apoio para o ddesenvolvedor e esclarecer o erro
        }
        return null;
    }
}
