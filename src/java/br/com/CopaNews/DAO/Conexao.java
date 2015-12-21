/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.CopaNews.DAO;
import java.sql.*;

/**
 *
 * @author hitalo
 */

public class Conexao {
    
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/CopaDB";
    
    public static Connection getConexao(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(DATABASE_URL,"postgres","14785");
            System.out.println("Conexão feita com sucesso");
        } catch (SQLException ex) {
            System.out.println("Falha na Conexão");
            ex.printStackTrace();
        }
        
        return conn;
    }
}
