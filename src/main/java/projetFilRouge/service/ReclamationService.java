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
import projetFilRouge.dao.ReclamationDAOCrud;
import projetFilRouge.entity.Reclamation;
import projetFilRouge.entity.Commande;

/**
 *
 * @author alexa
 */

@Transactional
@Service
public class ReclamationService {
    
    @Autowired
    private ReclamationDAOCrud dao;
    
     //On ajoutte une réclamation sur une commande déterminée !!! 
    public void ajouterReclamation(Reclamation uneReclamation, Commande uneCommande){ // OK
        if(uneCommande != null ) {
            uneCommande.getReclamations().add(uneReclamation);
            uneReclamation.setCommandeReclamation(uneCommande);
            dao.save(uneReclamation);
        }
    }
    
    public void supprimerReclamation(Long idReclamation){
         if(dao.findOne(idReclamation) != null) {
            dao.delete(dao.findOne(idReclamation));
         }else{
              System.out.println("La reclamation avec id " + idReclamation + "n'existe pas en BD");
        }
    }
    
    public List<Reclamation> afficherListeReclamations(){ // OK
        System.out.println((List<Reclamation>) dao.findAll());
        return (List<Reclamation>) dao.findAll();
    }

}
