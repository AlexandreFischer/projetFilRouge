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
    
    public void ajouterReclamation(Reclamation reclamation){ // OK
        dao.save(reclamation);
    }
    
    public void supprimerReclamation(Long idReclamation){
        dao.delete(dao.findOne(idReclamation));
    }
    
    public List<Reclamation> afficherListeReclamations(){ // OK
        System.out.println((List<Reclamation>) dao.findAll());
        return (List<Reclamation>) dao.findAll();
    }

}
