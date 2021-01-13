/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ibyte
 */
public class Conexao {
    String serverName = "localhost"; //caminho do servidor do BD
    String myDataBase = "cadastro_curriculo";
    String url = "jdbc:mysql://" + serverName + ":3306/" + myDataBase + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String username = "root";
    String password = "";
    Connection conexao;
    
    Conexao() throws ClassNotFoundException, SQLException{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = DriverManager.getConnection(url, username, password);
                System.out.println("Deu certo!");
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro: "+ex.getMessage());
            }

    }
}
