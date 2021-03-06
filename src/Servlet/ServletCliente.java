package Servlet;

import Model.Cliente;
import Model.DAO.*;
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
        ClienteDAO dao = DAOFactory.initClienteDAO();
        switch(acao){
            case "Inserir":
                c.setNome(nome);
                c.setEmail(email);
                try{
                    dao.save(c);
                    response.getWriter().println(c.getID());
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                break;
            case "Consultar":
                dao.getClienteByID(c.getID());
                break;
            case "Atualizar":
                try {
                    dao.update(c);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                break;
            case "Deletar":
                try{
                    dao.remove(c);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
