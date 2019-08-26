/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.entity.Article;

/**
 *
 * @author alexa
 * @correction Jean
 */
@Transactional
@Service
public class ArticleService {

    @Autowired
    private ArticleDAOCrud dao;
   
    
    //On ajoutte un article en BD 
    public void ajouterArticle(Article article) {
       if(article != null) {
            
            //On vérifie que l'article n'est pas présent dans la BD. 
            //Sans cette condition de contrôle, si l'article passé en paramètre existe dans la BD alors une erreur rouge est lancé
            if( dao.findByNom(article.getNom()) == null  ) {  //s'il n'existe pas dans la BD (null 
                 dao.save(article);
            }
        }
    }
    
    
    public void  modifierArticle(Article articleBD, Article articleAvecLesModifications){
       
        if(   articleBD  != null ) { //l'article "articleBD" existe dans la BD , alors on peut le modifier
             Long Id_articleBD = articleBD.getId();
             Article art       = dao.findById(Id_articleBD);
             art.setNom( articleAvecLesModifications.getNom() );
             dao.save(art);
        }
    }
    
  
    
    public void supprimerArticle(String nomArticle) {
        if( dao.findByNom(nomArticle) != null  ) {     //s'il existe dans la BD , alors on peut le supprimer
            dao.delete(dao.findByNom(nomArticle));
        }
    }

    
    public Iterable<Article> afficherListeArticle() {
        System.out.println((List<Article>) dao.findAll());
        //return (List<Article>) dao.findAll();
        return dao.findAll();
    }

    public List<Article> afficherArticleParCategorieHomme() {
        System.out.println(dao.findByCategorie(Article.Categorie.HOMME));
        return dao.findByCategorie(Article.Categorie.HOMME);
    }

    public List<Article> afficherArticleParCategorieFemme() {
        System.out.println(dao.findByCategorie(Article.Categorie.FEMME));
        return dao.findByCategorie(Article.Categorie.FEMME);
    }

    public List<Article> afficherArticleParCategorieSac() {
        System.out.println(dao.findByCategorie(Article.Categorie.SAC));
        return dao.findByCategorie(Article.Categorie.SAC);
    }
    
    public Article afficherArticleParNom(String nomArticle){
        System.out.println(dao.findByNom(nomArticle));
        return dao.findByNom(nomArticle);
    }
}
