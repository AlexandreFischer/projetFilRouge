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
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends AutowireServlet {
    
    @Autowired
    private ClientService service;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String nom = req.getParameter("nom");
        String mail = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        
        Client client = new Client();
        client.setNom(nom);
        client.setMail(mail);
        client.setPointFidelite(0);
        if(password.equals(confirmPassword)){
            client.setPassword(password);
        }

        service.ajouterClient(client);
        
        resp.sendRedirect("accueil");
        
    }
    
    
    
}
