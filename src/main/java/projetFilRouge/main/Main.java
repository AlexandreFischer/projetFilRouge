/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import projetFilRouge.entity.Commande;

/**
 *
 * @author alexa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persistence.createEntityManagerFactory("projetFilRouge_PU");
        
    }
    
}
