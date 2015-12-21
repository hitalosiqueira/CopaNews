/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.CopaNews.DAO;

import br.com.CopaNews.Entidades.Time;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hitalo
 */
public class TimeDAO {
    private Connection c = Conexao.getConexao();
    
    public List<Time> buscaTodos(){
        String sql = "SELECT * FROM time";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }

    public List<Time> buscaNome(String Nome){
        String sql = "SELECT * FROM time WHERE LOWER(nome) like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    public List<Time> buscaEsporte(String Esporte){
        String sql = "SELECT * FROM time where esporte like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Esporte + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    public List<Time> buscaEstadio(String Estadio){
        String sql = "SELECT * FROM time where estadio like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Estadio + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    public List<Time> buscaNomeEsporte(String Nome, String Esporte){
        String sql = "SELECT * FROM time where nome like ? and esporte like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            p.setString(2, "%" + Esporte + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    public List<Time> buscaNomeEstadio(String Nome, String Estadio){
        String sql = "SELECT * FROM time where nome like ? and estadio like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            p.setString(2, "%" + Estadio + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    public List<Time> buscaEsporteEstadio(String Esporte, String Estadio){
        String sql = "SELECT * FROM time where esporte like ? and estadio like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Esporte + "%");
            p.setString(2, "%" + Estadio + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    public List<Time> buscaNomeEsporteEstadio(String Nome, String Esporte, String Estadio){
        String sql = "SELECT * FROM time where nome like ? and esporte like ? and estadio like ?";
        List<Time> lista = new ArrayList<>();
        
        try {    
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            p.setString(2, "%" + Esporte + "%");
            p.setString(3, "%" + Estadio + "%");
            ResultSet resultado = p.executeQuery();
            
            while(resultado.next()){
                Time t = new Time();
                
                t.setNome(resultado.getString("nome"));
                t.setEsporte(resultado.getString("esporte"));
                t.setEstadio(resultado.getString("estadio"));
                
                lista.add(t);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }
        
        return lista;
    }
}
