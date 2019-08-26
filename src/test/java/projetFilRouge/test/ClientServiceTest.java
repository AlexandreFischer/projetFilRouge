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
import projetFilRouge.entity.Client;
import projetFilRouge.service.ClientService;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author alexa
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = SpringConfig.class)
//@Rollback(false)
//@Transactional
public class ClientServiceTest {

    @Autowired
    private ClientService clientS;

//    @Test
//    public void creerClientOK(){
//        Client client = new Client("TUTU", "tusdsdstu@tuttuu.com", "tutqsdqdututtytu", 456);
//        clientS.ajouterClient(client);
//    }
    
//    @Test
//    public void seConnecterAuSiteOK(){
//        Client client = new Client();
//        client.setMail("alexandre@gmail.com");
//        client.setPassword("fischer");
//        clientS.seConnecterAuSite(client);
//    }
    
//    @Test
//    public void seConnecterAuSiteKO(){
//        Client client = new Client();
//        client.setMail("okdq@lqs,sdq");
//        client.setPassword("okokok");
//        clientS.seConnecterAuSite(client);
//    }
    
//    @Test
//    public void supprimerClientOK(){
//        Client client = new Client();
//        client.setNom("koko");
//        clientS.supprimerClient(client);
//    }
    
//    @Test
//    public void afficherListeClientOK(){
//        clientS.afficherListeClients();
//    }
    
//    @Test
//    public void afficherClientParNomOK() {
//        clientS.afficherClientParNom("VALERY");
//    }

//    @Test
//    public void afficherClientParMailOK() {
//        clientS.afficherClientParMail("alexandre@gmail.com");
//    }

//    @Test
//    public void afficherClientParMailAndPasswordOK() {
//        clientS.afficherClientParMailAndPassword("alexandre@gmail.com", "fischer");
//    }
    
//    @Test
//    public void supprimerClientOK(){
//        clientS.supprimerClient("TUTU");
//    }

}
