/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CopaNews.Testes;

import br.com.CopaNews.DAO.JogadorEstadioDAO;
import br.com.CopaNews.Entidades.JogadorEstadio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hitalo
 */
public class TesteJogadorEstadioDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<JogadorEstadio> lista = new ArrayList<JogadorEstadio>();
        JogadorEstadioDAO je = new JogadorEstadioDAO();

        lista = je.buscaEstadio("field");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome());
            System.out.println(lista.get(i).getSobrenome());
            System.out.println(lista.get(i).getApelido());
            System.out.println(lista.get(i).getEstadio());
            System.out.println();
            System.out.println();
        }

    }

}
