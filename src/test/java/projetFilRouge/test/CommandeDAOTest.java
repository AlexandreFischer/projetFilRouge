/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ClientDAOCrud;
import projetFilRouge.entity.Commande;
import projetFilRouge.entity.Client;
import projetFilRouge.spring.SpringConfig;
import projetFilRouge.dao.CommandeDAOCrud;
import static projetFilRouge.entity.Commande_.date;
import static projetFilRouge.entity.Commande_.dateLivraisonCommande;

/**
 *
 * @author JM
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
@Transactional
public class CommandeDAOTest {

    @Autowired  
    private CommandeDAOCrud dao;
    
    @Autowired  
    private ClientDAOCrud daoC;
    
    @Test
    public void ajouterCommandeOK(){
        
        Commande c = new Commande(500.34, "not checked",2);
        Client jm = new Client("JM", "jm@jm.fr", "jmjmjm", 6754);
        daoC.save(jm);
        c.setClient(jm);
        dao.save(c);
    }
    
    /*
    @Test
    @Transactional
    public void obtenirToutesLesCommandesOK() {
        List<Commande> commandes = dao.obtenirToutesLesCommandes();
        assertEquals(1, commandes.size());
    }
   */
    
    
    /*
    @Test
    @Transactional
    public void rechercherCommandeParIdOK() {
        long id = 2;
        //CommandeDAO dao = new CommandeDAO();
        Commande c = dao.rechercherCommandeParId(id);
        long id_c = c.getId();
        assertEquals(id_c, id);
    }*/

    
    /*
    @Test
    @Transactional
    public void modifierCommandeParIdOK() {
        //CommandeDAO dao = new CommandeDAO();
        long idCommande= 2;
       
        Commande c = dao.rechercherCommandeParId(idCommande);
        c.setMoyenDePaiement(Commande.MoyenDePaiement.VIREMENT);
        c.setTva(10);
        
         System.out.println("id commande obtenu: " + c.getId());
         
        if(c.getId() != null) {
            dao.modifierCommande( c );
            assertEquals( (long)c.getId(), idCommande);
            System.out.println("commande existe en BD");
            
        }else{
            System.out.println("commande n'existe en BD");
        }
    }
    */
    
    
    //--------------------------------------------------------
    
    
    
    
    
    /*
    @Test
    public void supprimerIdOK() { 
         CommandeDAO dao = new CommandeDAO();
         long idCommande= 2;
         if(idCommande > 0) {
            dao.supprimer(idCommande);
            System.out.println("commande supprimée en BD");
         }else{
              System.out.println("commande pas supprimée BD");
         }
        
    }
    */
    
    
    
    /*
    @Test
    public void ajouterCommandeOK() { 
        CommandeDAO dao = new CommandeDAO();
        //Client nouveauClient = new Client("toto2", "mail2", "pass2");
        //Commande noubelleCommande = new Commande();
        
        Client nouveauClient = new Client(2L, "toto2", "mail2", "pass2");
        Commande noubelleCommande = new Commande(20.95, nouveauClient);
        
        //if((long)noubelleCommande.getId() > 0) {
             
            dao.ajouterCommande(noubelleCommande);
         //   System.out.println("commande ajoutée en BD");
            
        // }else{
         //     System.out.println("commande pas  ajoutée en BD");
       // }
        
    }
   */
     

}
