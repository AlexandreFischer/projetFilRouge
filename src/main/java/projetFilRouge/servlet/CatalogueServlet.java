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
import projetFilRouge.service.ArticleService;
import projetFilRouge.spring.AutowireServlet;

/**
 *
 * @author alexa
 */
@WebServlet(name = "ListeDeTousLesArticles", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends AutowireServlet {

    @Autowired
    private ArticleService service;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Appel service
        req.setAttribute("articles", service.afficherListeArticle());
        
        // Renvoi vers la vue produits.jsp
        req.getRequestDispatcher("produits.jsp").forward(req, resp);
    }

    

}
