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

/**
 *
 * @author alexa
 */

@Transactional
@Service
public class ReclamationService {
    
    @Autowired
    private ReclamationDAOCrud dao;
    
    public void ajouterReclamation(Reclamation reclamation){
        dao.save(reclamation);
        System.out.println("COMMENTAIRE AJOUTE");
    }
    
    public void supprimerReclamation(Reclamation reclamation){
        dao.delete(dao.findByReclamation(reclamation.getReclamation()));
        System.out.println("RECLAMATION SUPPRIME");
    }
    
    public List<Reclamation> afficherListeReclamations(){
        System.out.println((List<Reclamation>) dao.findAll());
        return (List<Reclamation>) dao.findAll();
    }

}
