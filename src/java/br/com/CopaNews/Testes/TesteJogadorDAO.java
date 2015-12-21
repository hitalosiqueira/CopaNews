/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.CopaNews.Testes;

import br.com.CopaNews.Entidades.Jogador;
import br.com.CopaNews.DAO.JogadorDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hitalo
 */
public class TesteJogadorDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
        List<Jogador> lista = new ArrayList<Jogador>();
        JogadorDAO j = new JogadorDAO();
        
        lista = j.buscaTodos();
        
        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i).getId_jogador());
            System.out.println(lista.get(i).getNome());
            System.out.println(lista.get(i).getSobrenome());
            System.out.println(lista.get(i).getApelido());
            System.out.println(lista.get(i).getDatanasc_dia());
            System.out.println(lista.get(i).getDatanasc_mes());
            System.out.println(lista.get(i).getDatanasc_ano());
            System.out.println(lista.get(i).getAposentado());
            System.out.println(lista.get(i).getAposenta_data());
            System.out.println(lista.get(i).getAltura());
            System.out.println(lista.get(i).getPeso());
            System.out.println();
            System.out.println();
        }
        
    }
    
}
