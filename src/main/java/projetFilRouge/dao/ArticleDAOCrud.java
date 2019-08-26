/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import projetFilRouge.entity.Article;

/**
 *
 * @author JM
 */
public interface ArticleDAOCrud extends CrudRepository<Article, Long>{
    
    Article findByNom(String nom);
    Article findById (Long id);
    List<Article> findByCategorie(Article.Categorie categorie);
    
}
