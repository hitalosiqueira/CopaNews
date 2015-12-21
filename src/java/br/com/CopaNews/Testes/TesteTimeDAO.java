/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.CopaNews.Testes;

import br.com.CopaNews.DAO.TimeDAO;
import br.com.CopaNews.Entidades.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hitalo
 */
public class TesteTimeDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Time> lista = new ArrayList<Time>();
        TimeDAO t = new TimeDAO();
        
        
        //lista = t.buscaTodos();
        lista = t.buscaNome("Merica");
        //lista = t.buscaEsporte("Fut");
        //lista = t.buscaEstadio("Ch");
        //lista = t.buscaNomeEsporte("76", "q");
        //lista = t.buscaNomeEstadio("Cal", "ger");
        //lista = t.buscaEsporteEstadio("Bei", "ie");
        //lista = t.buscaNomeEsporteEstadio("zona", "B", "ase");
        
        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i).getNome());
            System.out.println(lista.get(i).getEsporte());
            System.out.println(lista.get(i).getEstadio());
            System.out.println();
            System.out.println();
        }
        
    }
}
    
