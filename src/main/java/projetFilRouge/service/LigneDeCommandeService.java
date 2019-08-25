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

/**
 *
 * @author alexa
 */
@Transactional
@Service
public class LigneDeCommandeService {

    @Autowired
    private LigneDeCommandeDAOCrud dao;
    
    public void ajouterLigneDeCommande(LigneDeCommande ligneCmd){
        dao.save(ligneCmd);
    }
    
    public void supprimerLigneDeCommande(long idLigneDeCommande){
        dao.delete(dao.findOne(idLigneDeCommande));
    }
    
    public void modifierQuantiteLigneDeCommande(LigneDeCommande ligneCmd, Long quantite){
        LigneDeCommande ligneDeCmd = dao.findOne(ligneCmd.getId());
        ligneCmd.setQuantiteArticle(quantite);
        dao.save(ligneDeCmd);
    }

}
