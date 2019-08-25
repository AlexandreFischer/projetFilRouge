/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.CommandeDAOCrud;
import projetFilRouge.entity.Reclamation;
import projetFilRouge.service.ClientService;
import projetFilRouge.service.ReclamationService;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author alexa
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
@Transactional
public class ReclamationServiceTest {

    @Autowired
    private ReclamationService reclamationS;
    
    @Autowired
    private CommandeDAOCrud daoCommande;
    
    
//    @Test
//    public void creerReclamationOK() {
//        Reclamation reclamation = new Reclamation("Reclamation 1", daoCommande.findOne(5L));
//        reclamationS.ajouterReclamation(reclamation);
//    }

//    @Test
//    public void supprimerReclamationOK() {
//        reclamationS.supprimerReclamation(2L);
//    }

//    @Test
//    public void afficherListeReclamationsOK() {
//        reclamationS.afficherListeReclamations();
//    }

}
