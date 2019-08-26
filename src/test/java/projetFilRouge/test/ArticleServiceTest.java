/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.service.ArticleService;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author alexa
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = SpringConfig.class)
//@Rollback(false)
//@Transactional
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleS;

    @Autowired
    private ArticleDAOCrud daoArticle;

    @Test
    public void creerArticleOK(){
        Article article = new Article("Chaussons", 20.99, 1, 1, 15);
        article.setCategorie(Article.Categorie.HOMME);
        articleS.ajouterArticle(article);
    }
    
//    @Test
//    public void modifierArticleOK(){
//        
//        Article art = daoArticle.findByNom("trotinette");
//        art.setNom("TROTINETTE");
//        articleS.modifierArticle(art);
//    }
    
//    @Test
//    public void afficherListeArticleOK(){
//        articleS.afficherListeArticle();
//    }
    
//    @Test
//    public void afficherArticleParCategorieHommeOK(){
//        articleS.afficherArticleParCategorieHomme();
//    }
    
//    @Test
//    public void afficherArticleParCategorieFemmeOK() {
//        articleS.afficherArticleParCategorieFemme();
//    }
    
//    @Test
//    public void afficherArticleParCategorieSacOK() {
//        articleS.afficherArticleParCategorieSac();
//    }
    
//    @Test
//    public void afficherArticleParNomOK(){
//        articleS.afficherArticleParNom("sac cuir");
//    }
    
//    @Test
//    public void supprimerArticleOK(){
//        articleS.supprimerArticle("sac cuir");
//    }
    
}
