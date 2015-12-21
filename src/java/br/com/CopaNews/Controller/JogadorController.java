/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CopaNews.Controller;

import br.com.CopaNews.DAO.JogadorDAO;
import br.com.CopaNews.Entidades.Jogador;
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
@WebServlet(name = "JogadorController", urlPatterns = {"/JogadorController"})
public class JogadorController extends HttpServlet {

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
            out.println("<title>Servlet JogadorController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JogadorController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        System.out.println("POST");
        JogadorDAO j = new JogadorDAO();
        List<Jogador> lista = null;

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String apelido = request.getParameter("apelido");

        if ((nome.isEmpty()) && (sobrenome.isEmpty()) && (apelido.isEmpty())) {
            lista = j.buscaTodos();
        } else {
            if ((sobrenome.isEmpty()) && (apelido.isEmpty())) {
                lista = j.buscaNome(nome);
            } else {
                if ((nome.isEmpty()) && (apelido.isEmpty())) {
                    lista = j.buscaSobrenome(sobrenome);
                } else {
                    if ((nome.isEmpty()) && (sobrenome.isEmpty())) {
                        lista = j.buscaApelido(apelido);
                    } else {
                        if ((apelido.isEmpty())) {
                            lista = j.buscaNomeSobrenome(nome, sobrenome);
                        } else {
                            if ((sobrenome.isEmpty())) {
                                lista = j.buscaNomeApelido(nome, apelido);
                            } else {
                                if (nome.isEmpty()) {
                                    lista = j.buscaSobrenomeApelido(sobrenome, apelido);
                                } else {
                                    if ((!nome.isEmpty()) && (!sobrenome.isEmpty()) && (!apelido.isEmpty())) {
                                        lista = j.buscaNomeSobrenomeApelido(nome, sobrenome, apelido);
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        request.setAttribute("jogador",lista);
        RequestDispatcher jogador = request.getRequestDispatcher("jogador.jsp");
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
