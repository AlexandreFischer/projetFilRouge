/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.dao.CommentaireDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Commentaire;
import projetFilRouge.service.ClientService;
import projetFilRouge.service.CommentaireService;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author alexa
 * @correction jean-marie
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
@Transactional
public class CommentaireServiceTest {
    
    @Autowired
    private CommentaireService commentaireS;
    
    @Autowired
    private CommentaireDAOCrud daoCommentaire;
    
    @Autowired
    private ArticleDAOCrud daoArticle;
    
    @Test
    public void creerCommentaireOK(){
        Commentaire commentaire = new Commentaire("Commentaire 1");
        Article unArticle = daoArticle.findByNom("Chaussons");
        commentaireS.ajouterCommentaire(commentaire, unArticle);
    }
    
    
    @Test
    public void supprimerCommentaireOK(){
        commentaireS.supprimerCommentaire(2);
    }
    
    @Test
    public void supprimerCommentaireKO(){
        commentaireS.supprimerCommentaire(1000);
    }
    
    @Test
    public void afficherListeCommentairesOK(){
       commentaireS.afficherListeCommentaires();
  }
    
    
    @Test
    public void afficherCommentaireParArticleOK(){
        commentaireS.afficherCommentaireParArticle(daoArticle.findByNom("SAC"));
    }
    
    @Test
    public void afficherCommentaireParArticleKO(){
        commentaireS.afficherCommentaireParArticle(daoArticle.findByNom("Chaussons"));
    }
}
