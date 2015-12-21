/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CopaNews.DAO;

import br.com.CopaNews.Entidades.JogadorEstadio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hitalo
 */
public class JogadorEstadioDAO {

    private Connection c = Conexao.getConexao();

    public List<JogadorEstadio> buscaTodos() {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador limit 1000";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<JogadorEstadio> buscaNome(String Nome) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower(j.nome) like ? order by ts_rank_cd(to_tsvector(j.nome), to_tsquery(?)) desc;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome.toLowerCase() + "%");
            p.setString(2, "%" + Nome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }
    
        public List<JogadorEstadio> buscaSobrenome(String Sobrenome) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower(j.sobrenome) like ? order by ts_rank_cd(to_tsvector(j.sobrenome), to_tsquery(?)) desc;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Sobrenome.toLowerCase() + "%");
            p.setString(2, "%" + Sobrenome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }
    

    public List<JogadorEstadio> buscaEstadio(String Estadio) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower(t.estadio) like ? order by ts_rank_cd(to_tsvector(t.estadio), to_tsquery(?)) desc limit 100;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Estadio.toLowerCase() + "%");
            p.setString(2, "%" + Estadio.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }

    public List<JogadorEstadio> buscaNomeSobrenome(String Nome, String Sobrenome) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower(j.nome) like ? and lower(j.sobrenome) like ? order by ts_rank_cd(to_tsvector(j.nome), to_tsquery(?)) desc;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome.toLowerCase() + "%");
            p.setString(2, "%" + Sobrenome.toLowerCase() + "%");
            p.setString(3, "%" + Nome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }
    public List<JogadorEstadio> buscaNomeEstadio(String Nome, String Estadio) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower(j.nome) like ? and lower(t.estadio) like ? order by ts_rank_cd(to_tsvector(j.nome), to_tsquery(?)) desc;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome.toLowerCase() + "%");
            p.setString(2, "%" + Estadio.toLowerCase() + "%");
            p.setString(3, "%" + Nome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }
    
    public List<JogadorEstadio> buscaSobrenomeEstadio(String Sobrenome, String Estadio) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower(j.sobrenome) like ? and lower(t.estadio) like ? order by ts_rank_cd(to_tsvector(j.sobrenome), to_tsquery(?)) desc;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Sobrenome.toLowerCase() + "%");
            p.setString(2, "%" + Estadio.toLowerCase() + "%");
            p.setString(3, "%" + Sobrenome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
            }
            p.close();
            System.out.println("busca realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("falha na busca");
            ex.printStackTrace();
        }

        return lista;
    }
    public List<JogadorEstadio> buscaNomeSobrenomeEstadio(String Nome, String Sobrenome, String Estadio) {
        String sql = "select j.nome, j.sobrenome, j.apelido, t.estadio from jogador j, \"time\" t, jogador_time jt where j.id_jogador = jt.jogador and lower (j.nome) like ? and lower(j.sobrenome) like ? and lower(t.estadio) like ? order by ts_rank_cd(to_tsvector(j.nome), to_tsquery(?)) desc;";
        List<JogadorEstadio> lista = new ArrayList<>();

        try {
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "%" + Nome.toLowerCase() + "%");
            p.setString(2, "%" + Sobrenome.toLowerCase() + "%");
            p.setString(3, "%" + Estadio.toLowerCase() + "%");
            p.setString(4, "%" + Nome.toLowerCase() + "%");
            ResultSet resultado = p.executeQuery();

            while (resultado.next()) {
                JogadorEstadio je = new JogadorEstadio();

                je.setNome(resultado.getString("nome"));
                je.setSobrenome(resultado.getString("sobrenome"));
                je.setApelido(resultado.getString("apelido"));
                je.setEstadio(resultado.getString("estadio"));

                lista.add(je);
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
