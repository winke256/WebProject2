package Servlet;

import Model.Cliente;
import Model.DAO.DAOFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletCliente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id 			= Integer.parseInt(request.getParameter("idCliente"));
        String nome 	= request.getParameter("nomeCliente");
        String email 	= request.getParameter("emailCliente");
        String acao 	= request.getParameter("oQueFazer");
        Cliente c 		= new Cliente();
        switch(acao){
            case "Inserir":
                c.setNome(nome);
                c.setEmail(email);
                try{
                    DAOFactory.initClienteDAO().save(c);
                    response.getWriter().println(c.getID());
                }catch(Exception ex){
                    ex.printStackTrace();
                }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
