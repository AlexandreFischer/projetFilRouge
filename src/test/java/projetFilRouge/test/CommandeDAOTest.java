/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projetFilRouge.entity.Commande;
import projetFilRouge.dao.CommandeDAO;
import projetFilRouge.entity.Client;

/**
 *
 * @author JM
 */
public class CommandeDAOTest {

    public CommandeDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void obtenirToutesLesCommandesOK() {
        CommandeDAO dao = new CommandeDAO();
        List<Commande> commandes = dao.obtenirToutesLesCommandes();
        assertEquals(1, commandes.size());
    }

    @Test
    public void rechercherCommandeParIdOK() {
        long id = 2;
        CommandeDAO dao = new CommandeDAO();
        Commande c = dao.rechercherCommandeParId(id);
        long id_c = c.getId();
        assertEquals(id_c, id);
    }

    
    
    @Test
    public void modifierCommandeParIdOK() {
        CommandeDAO dao = new CommandeDAO();
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
