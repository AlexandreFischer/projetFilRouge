/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import projetFilRouge.entity.Client;
import projetFilRouge.service.ClientService;
import projetFilRouge.spring.AutowireServlet;

/**
 *
 * @author alexa
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/connexion"})
public class ConnexionServlet extends AutowireServlet {
    
    @Autowired
    private ClientService service;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String mail = req.getParameter("email");
       String password = req.getParameter("password");
       
       Client client = service.afficherClientParMailAndPassword(mail, password);
       
       if(client != null){
           req.getSession().setAttribute("clientConnecte", client);
       }
       // commentaire pour voir
       resp.sendRedirect("accueil");
    }
}
