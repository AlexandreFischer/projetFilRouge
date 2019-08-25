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
    
    public void ajouterCommentaire(Commentaire commentaire){
        dao.save(commentaire);
    }
    
    public void supprimerCommentaire(long idCommentaire){
        dao.delete(dao.findOne(idCommentaire));
    }
    
    public List<Commentaire> afficherListeCommentaires(){
        System.out.println((List<Commentaire>) dao.findAll());
        return (List<Commentaire>) dao.findAll();
    }
    
    public List<Commentaire> afficherCommentaireParArticle(Article article){
        System.out.println(dao.findByArticleco(daoArticle.findByNom(article.getNom())));
        return dao.findByArticleco(daoArticle.findByNom(article.getNom()));
    }
}
