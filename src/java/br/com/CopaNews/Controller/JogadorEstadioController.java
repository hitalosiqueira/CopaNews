/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CopaNews.Controller;

import br.com.CopaNews.DAO.JogadorEstadioDAO;
import br.com.CopaNews.Entidades.JogadorEstadio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hitalo
 */
@WebServlet(name = "JogadorEstadioController", urlPatterns = {"/JogadorEstadioController"})
public class JogadorEstadioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JogadorEstadioController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JogadorEstadioController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        System.out.println("POST");
        JogadorEstadioDAO je = new JogadorEstadioDAO();
        List<JogadorEstadio> lista = null;

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String estadio = request.getParameter("estadio");
        
        
        
        if ((nome.isEmpty()) && (sobrenome.isEmpty()) && (estadio.isEmpty())) {
            lista = je.buscaTodos();
        } else {
            if ((sobrenome.isEmpty()) && (estadio.isEmpty())) {
                lista = je.buscaNome(nome);
            } else {
                if ((nome.isEmpty()) && (estadio.isEmpty())) {
                    lista = je.buscaSobrenome(sobrenome);
                } else {
                    if ((nome.isEmpty()) && (sobrenome.isEmpty())) {
                        lista = je.buscaEstadio(estadio);
                    } else {
                        if ((estadio.isEmpty())) {
                            lista = je.buscaNomeSobrenome(nome, sobrenome);
                        } else {
                            if ((sobrenome.isEmpty())) {
                                lista = je.buscaNomeEstadio(nome, estadio);
                            } else {
                                if (nome.isEmpty()) {
                                    lista = je.buscaSobrenomeEstadio(sobrenome, estadio);
                                } else {
                                    if ((!nome.isEmpty()) && (!sobrenome.isEmpty()) && (!estadio.isEmpty())) {
                                        lista = je.buscaNomeSobrenomeEstadio(nome, sobrenome, estadio);
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        request.setAttribute("jogadorestadio",lista);
        RequestDispatcher jogador = request.getRequestDispatcher("jogadorestadio.jsp");
        jogador.forward(request, response);
    }

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
