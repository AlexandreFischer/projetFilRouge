/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.dao.CommentaireDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Commentaire;

/**
 *
 * @author alexa
 */

@Transactional
@Service
public class CommentaireService {
    
    @Autowired
    private CommentaireDAOCrud dao;
    
    @Autowired
    private ArticleDAOCrud daoArticle;
    
    //On ajoutte un commentaire à un article déterminé !!! 
    public void ajouterCommentaire(Commentaire commentaire, Article unArticle){
        if(unArticle != null ) {
            unArticle.getCommentairesArticle().add(commentaire);
            commentaire.setArticleco(unArticle);
            dao.save(commentaire);
        }
    }
    
    public void supprimerCommentaire(long idCommentaire){
        if(dao.findOne(idCommentaire) != null) {
            dao.delete(dao.findOne(idCommentaire));
        }else{
              System.out.println("Le commentarie avec id " + idCommentaire + "n'existe pas");
        }
    }
    
    public Iterable<Commentaire> lister(){
        return dao.findAll();
    }
    
    
    public List<Commentaire> afficherListeCommentaires(){
        System.out.println((List<Commentaire>) dao.findAll());
        return (List<Commentaire>) dao.findAll();
    }
    
    public List<Commentaire> afficherCommentaireParArticle(Article article){
        List<Commentaire> c = new ArrayList<Commentaire>();
           
        if(article == null){  //"si l'article n'extiste Pas (article == null) alors une erreur va se lancer et le test ne marchera pas !!!!);
                System.out.println();
                System.out.println("===================================================================");
                //System.out.println("Cet article n'extiste Pas"); 
                System.out.println("===================================================================");
                System.out.println();
                
        }else {  //(article != null
                System.out.println();
                System.out.println("===================================================================");
                System.out.println(article.getNom());  //Cet article EXISTE"); 
                System.out.println("===================================================================");
                System.out.println();
                System.out.println(dao.findByArticleco(daoArticle.findByNom(article.getNom())));
               c = dao.findByArticleco(daoArticle.findByNom(article.getNom())); 
               
               System.out.println("===================================================================");
               System.out.println();
        }
        return c;
    }
}
