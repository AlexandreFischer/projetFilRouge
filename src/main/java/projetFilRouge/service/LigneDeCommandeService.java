/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.LigneDeCommandeDAOCrud;
import projetFilRouge.entity.LigneDeCommande;
import projetFilRouge.entity.Commande;

/**
 *
 * @author alexa
 * @Correction Jean-Marie
 */
@Transactional
@Service
public class LigneDeCommandeService {

    @Autowired
    private LigneDeCommandeDAOCrud dao;
    
    public void ajouterLigneDeCommande(LigneDeCommande ligneCmd, Commande uneCommande){
         if(uneCommande != null ) {
            uneCommande.getListeLignedecommande().add(ligneCmd);
            ligneCmd.setCommande(uneCommande);
            dao.save(ligneCmd);
        }
    }
    
    
    public void supprimerLigneDeCommande(long idLigneDeCommande){
          if(dao.findOne(idLigneDeCommande) != null) {
             dao.delete(dao.findOne(idLigneDeCommande));
         }else{
              System.out.println("La reclamation avec id " + idLigneDeCommande + "n'existe pas en BD");
        }
    }
    
    public void modifierQuantiteLigneDeCommande(LigneDeCommande ligneCmd, Long quantite){
        LigneDeCommande ligneDeCmd = dao.findOne(ligneCmd.getId());
        ligneDeCmd.setQuantiteArticle(quantite);
        dao.save(ligneDeCmd);
    }

}
