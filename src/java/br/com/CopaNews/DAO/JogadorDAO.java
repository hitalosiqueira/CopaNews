/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CopaNews.DAO;

import br.com.CopaNews.Entidades.Jogador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hitalo
 */
public class JogadorDAO {

    private Connection c = Conexao.getConexao();

    public List<Jogador> buscaTodos() {
        String sql = "SELECT * FROM jogador";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Jogador> buscaNome(String Nome) {
        String sql = "SELECT * FROM jogador WHERE nome like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            ResultSet resultado = p.executeQuery();

            System.out.println("passei");
            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Jogador> buscaSobrenome(String Sobrenome) {
        String sql = "SELECT * FROM jogador WHERE sobrenome like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Sobrenome + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setDatanasc_cidade(resultado.getInt("datanasc_cidade"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Jogador> buscaApelido(String Apelido) {
        String sql = "SELECT * FROM jogador WHERE apelido like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Apelido + "%");
            ResultSet resultado = p.executeQuery();

            System.out.println("passei");
            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setDatanasc_cidade(resultado.getInt("datanasc_cidade"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Jogador> buscaNomeSobrenome(String Nome, String Sobrenome) {
        String sql = "SELECT * FROM jogador WHERE Nome like ? AND Sobrenome like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            p.setString(2, "%" + Sobrenome + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setDatanasc_cidade(resultado.getInt("datanasc_cidade"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);

            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Jogador> buscaSobrenomeApelido(String Sobrenome, String Apelido) {
        String sql = "SELECT * FROM jogador WHERE Sobrenome like ? AND Apelido like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Sobrenome + "%");
            p.setString(2, "%" + Apelido + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setDatanasc_cidade(resultado.getInt("datanasc_cidade"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Jogador> buscaNomeSobrenomeApelido(String Nome, String Sobrenome, String Apelido) {
        String sql = "SELECT * FROM jogador WHERE Nome like ? AND Sobrenome like ? AND Apelido like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            p.setString(2, "%" + Sobrenome + "%");
            p.setString(3, "%" + Apelido + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setDatanasc_cidade(resultado.getInt("datanasc_cidade"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }
    
    public List<Jogador> buscaNomeApelido(String Nome, String Apelido) {
        String sql = "SELECT * FROM jogador WHERE nome like ? AND apelido like ?";
        List<Jogador> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome + "%");
            p.setString(2, "%" + Apelido + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                Jogador j = new Jogador();

                j.setId_jogador(resultado.getInt("id_jogador"));
                j.setNome(resultado.getString("nome"));
                j.setSobrenome(resultado.getString("sobrenome"));
                j.setApelido(resultado.getString("apelido"));
                j.setDatanasc_dia(resultado.getInt("datanasc_dia"));
                j.setDatanasc_mes(resultado.getInt("datanasc_mes"));
                j.setDatanasc_ano(resultado.getInt("datanasc_ano"));
                j.setDatanasc_cidade(resultado.getInt("datanasc_cidade"));
                j.setAltura(resultado.getString("altura"));
                j.setPeso(resultado.getString("peso"));
                j.setAposentado(resultado.getInt("aposentado"));
                j.setAposenta_data(resultado.getString("aposenta_data"));

                lista.add(j);

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
