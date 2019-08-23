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
import projetFilRouge.dao.CommentaireDAOCrud;
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
    
    public void ajouterCommentaire(Commentaire commentaire){
        dao.save(commentaire);
        System.out.println("COMMENTAIRE AJOUTE");
    }
    
    public void supprimerCommentaire(Commentaire commentaire){
        dao.delete(dao.findByCommentaire(commentaire.getCommentaire()));
        System.out.println("COMMENTAIRE SUPPRIME");
    }
    
    public List<Commentaire> afficherListeCommentaires(){
        System.out.println((List<Commentaire>) dao.findAll());
        return (List<Commentaire>) dao.findAll();
    }

}
