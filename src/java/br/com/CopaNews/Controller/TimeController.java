package br.com.CopaNews.Controller;

import br.com.CopaNews.DAO.TimeDAO;
import br.com.CopaNews.Entidades.Time;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hitalo
 */
public class TimeController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TimeController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TimeController at " + request.getContextPath() + "</h1>");
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
        TimeDAO t = new TimeDAO();
        List<Time> lista = null;

        String nome = request.getParameter("nome");
        String estadio = request.getParameter("estadio");

        if ((nome.isEmpty()) && (estadio.isEmpty())) {
            lista = t.buscaTodos();
        } else {
            if (estadio.isEmpty()) {
                lista = t.buscaNome(nome);
            } else {
                if (nome.isEmpty()) {
                    lista = t.buscaEstadio(estadio);
                } else {
                    if ((!nome.isEmpty()) && (!estadio.isEmpty())) {
                        lista = t.buscaNomeEstadio(nome, estadio);
                    }
                }
            }
        }
        request.setAttribute("time",lista);
        RequestDispatcher time = request.getRequestDispatcher("time.jsp");
        time.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
