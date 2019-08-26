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
 * @correction Jean
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


//    @Test
//    public void creerArticleOK(){
//        Article article = new Article("Chaussons", 20.99, 1, 1, 15);
//        article.setCategorie(Article.Categorie.HOMME);
//        articleS.ajouterArticle(article);
//    }

    
    
    @Test
    public void creerArticleKO(){  //L'article "chaussure existe déjà et donc l'erreur qui était lancé ne se lance plus
        Article article = new Article("chaussure", "belles chaussures", 20.99, 1 , 2, 3, Article.Categorie.HOMME);             
        article.setCategorie(Article.Categorie.HOMME);
        articleS.ajouterArticle(article);
    }
    
    
    
     @Test
    public void modifierArticleOK(){
        Article articleBD = daoArticle.findByNom("Super pantalon");//peut renvoyer null si l'article "pantalon" n'existe pas en BD  
        Article articleAvecModifications = new Article();
        articleAvecModifications.setNom("pantalon");
        articleAvecModifications.setPrixHT(150.66);
        articleAvecModifications.setCategorie(Article.Categorie.FEMME);
        articleAvecModifications.setDelaisAppros(8);
        articleAvecModifications.setDelaisDeLivraisonArt(10);
        articleAvecModifications.setQuantiteStock(300);
        articleS.modifierArticle(articleBD, articleAvecModifications);
    }
    
    
     
    @Test
    public void modifierArticleKO(){  //l'article "chips" n'existe pas en BD et on veut y acceder pour le modifier !!!
        Article articleBD = daoArticle.findByNom("chips");  //peut renvoyer null si l'article "Chaussons" n'existe pas en BD  
        Article articleAvecModifications = new Article();
        articleAvecModifications.setNom("Les chips");
        articleS.modifierArticle(articleBD, articleAvecModifications);
    }
    

   @Test
    public void afficherListeArticleOK(){
       articleS.afficherListeArticle();
   }
    
    @Test
    public void afficherArticleParCategorieHommeOK(){
        articleS.afficherArticleParCategorieHomme();
    }
    
    @Test
    public void afficherArticleParCategorieFemmeOK() {
        articleS.afficherArticleParCategorieFemme();
    }
    
    @Test
    public void afficherArticleParCategorieSacOK() {
        articleS.afficherArticleParCategorieSac();
    }
    
    
   @Test
    public void afficherArticleParNomOK(){
        articleS.afficherArticleParNom("chemise");
    }
    
    
    @Test
    public void afficherArticleParNomKO(){
        articleS.afficherArticleParNom("sac inexistant");
    }
    
    
    @Test
    public void supprimerArticleOK(){
        articleS.supprimerArticle("Li chassure");
        articleS.supprimerArticle("Lo chassure");
    }
    
     @Test
    public void supprimerArticleKO(){
        articleS.supprimerArticle("sac inexistant");
    }
    
}
