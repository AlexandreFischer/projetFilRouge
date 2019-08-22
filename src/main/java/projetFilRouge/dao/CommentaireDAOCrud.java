/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Commande;
import projetFilRouge.entity.Commentaire;

/**
 *
 * @author JM
 */
public interface CommentaireDAOCrud extends CrudRepository<Commentaire, Long>{
    
List<Commentaire> findByArticleC(String commentaire);
   
  
   
    
}
