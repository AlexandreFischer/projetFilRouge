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
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.dao.CommandeDAOCrud;
import projetFilRouge.dao.LigneDeCommandeDAOCrud;
import projetFilRouge.entity.LigneDeCommande;
import projetFilRouge.service.LigneDeCommandeService;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author alexa
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
@Transactional
public class LigneDeCommandeServiceTest {
    
    @Autowired
    private LigneDeCommandeService ligneCmdS;
    
    @Autowired
    private ArticleDAOCrud daoArticle;
    
    @Autowired
    private CommandeDAOCrud daoCommande;
    
    @Autowired
    private LigneDeCommandeDAOCrud daoLigneDeCmd;
    
//    @Test
//    public void ajouterLigneDeCommandeOK(){
//        LigneDeCommande ligneCmd = new LigneDeCommande(2L, LigneDeCommande.TypeLigneDeCommande.COMMANDE);
//        ligneCmdS.ajouterLigneDeCommande(ligneCmd);
//    }
    
//    @Test
//    public void supprimerLigneDeCommandeOK(){
//        ligneCmdS.supprimerLigneDeCommande(1L);
//    }
    
//    @Test
//    public void modifierQuantiteLigneDeCommandeOK(){
//        ligneCmdS.modifierQuantiteLigneDeCommande(daoLigneDeCmd.findOne(2L),7L);
//    }
    
}
