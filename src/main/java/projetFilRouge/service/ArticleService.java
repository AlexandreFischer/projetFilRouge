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
 */
@Transactional
@Service
public class ArticleService {

    @Autowired
    private ArticleDAOCrud dao;

    public void ajouterArticle(Article article) {
        dao.save(article);
    }

    public void modifierArticle(Article article) {
        Article art = dao.findOne(article.getId());
        dao.save(art);
    }

    public void supprimerArticle(String nomArticle) {
        dao.delete(dao.findByNom(nomArticle));
    }

    public Iterable<Article> afficherListeArticle() {
        System.out.println((List<Article>) dao.findAll());
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
