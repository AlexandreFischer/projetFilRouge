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
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.service.ArticleService;
import projetFilRouge.spring.AutowireServlet;

/**
 *
 * @author alexa
 */
@WebServlet(name = "HomepageVendeurServlet", urlPatterns = {"/accueilVendeur"})
public class HomepageVendeurServlet extends AutowireServlet {
    
    @Autowired
    private ArticleService artService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        // Récupère tous les articles
        req.setAttribute("articles", artService.lister());
        
        // Renvoi vers 1 vue ( JSP )
        req.getRequestDispatcher("articleVendeur.jsp").forward(req, resp);
    }

}
