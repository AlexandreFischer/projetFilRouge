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
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Article.Categorie;
import projetFilRouge.entity.Client;
import static projetFilRouge.entity.LigneDeCommande_.article;
import projetFilRouge.service.ArticleService;
import projetFilRouge.service.ClientService;
import projetFilRouge.spring.AutowireServlet;

/**
 *
 * @author alexa
 */
@WebServlet(name = "AjoutArticleVendeurServlet", urlPatterns = {"/ajoutArticleVendeur"})
public class AjoutArticleVendeurServlet extends AutowireServlet {
    
    @Autowired
    private ArticleService serviceArt;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        // Appel services au besoin

        String nom = req.getParameter("nom");
        String description = req.getParameter("description");
        String prixHT = req.getParameter("prixHT");
        String delaisAppros = req.getParameter("delaisAppros");
        String delaisDeLivraisonArt = req.getParameter("delaisDeLivraisonArt");
        String quantiteStock = req.getParameter("quantiteStock");
        String categorie = req.getParameter("categorie");
        String lienImage = req.getParameter("lienImage");
        
        Article article = new Article();
        article.setNom(nom);
        article.setDescription(description);
        article.setPrixHT(Double.valueOf(prixHT));
        article.setDelaisAppros(Integer.parseInt(delaisAppros));
        article.setDelaisDeLivraisonArt(Integer.parseInt(delaisDeLivraisonArt));
        article.setQuantiteStock(Integer.parseInt(quantiteStock)); 
        article.setCategorie(Categorie.valueOf(categorie));
        article.setLienImage("images/JPEG/"+lienImage);
        
        serviceArt.ajouterArticle(article);

        // Renvoi vers 1 vue ( JSP )   
        resp.sendRedirect("accueilVendeur");
    }
    
    

}
