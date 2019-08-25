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
public interface CommentaireDAOCrud extends CrudRepository<Commentaire, Long> {

    //--------------------------------------------------------------------------
    //List<Commentaire> findByArticleCListeLigneDeCommandes(long id);
    //Pour que la ligne d'instruction ci-dessus puisse fonctionner, 
    //il faut que dans l'entité "Commentaire",  l'attribut  "ArticleC"  
    //s'écrive sans une lettre en majuscule à la fin ( "articlec"  sans le "C" à la fin)
    //Voici la bonne instruction : 
    //PENSER À CHANGER L'ATTRIBUT "ArticleC" par "articlec" dans l'entité "Commentaire" !!!!!!!!!!!!!
    //List<Commentaire> findByArticlecoListeLigneDeCommandes(long id);
    //--------------------------------------------------------------------------
    
    Commentaire findByCommentaire(long idCommentaire);
    List<Commentaire> findByArticleco(Article articleco);

}
