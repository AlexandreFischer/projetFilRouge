/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ClientDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Client;
import projetFilRouge.entity.Commande;
import projetFilRouge.service.CommandeService;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author valery
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false) //actualiser BD
@Transactional
public class CommandeServiceTest {
    
    
    @Autowired
    private CommandeService commandeS;
    
    @Autowired
    private ClientDAOCrud daoClient;
    
    @Test
    public void ajouterCommandeOK(){
        Client client = new Client();
        client.setNom("TOTO");
        client.setMail("lsufd@sdfs.com"); 
        client.setPassword("toto");
        client.setPointFidelite(500);
        Commande cmd = new Commande(520.50, "ok cgv",10, new Date(), client);
        Article art = new Article("trotinette", 120.59D, 3, 7, 30);
        commandeS.ajouterPanier(2,art.getId(),3L);
    }
    
}
