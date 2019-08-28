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
@WebServlet(name = "VoirProduitServlet", urlPatterns = {"/voirProduit"})
public class VoirProduitServlet extends AutowireServlet {
    
    @Autowired
    private ArticleService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.setAttribute("voirProduit", service.afficherArticleParNom(req.getParameter("nomProduit")));
        
        req.getRequestDispatcher("modalVoirProduit.jsp").forward(req, resp);
    }



}
