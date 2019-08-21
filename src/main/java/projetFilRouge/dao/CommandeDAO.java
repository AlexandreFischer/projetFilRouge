/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

import ch.qos.logback.classic.util.ContextInitializer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import projetFilRouge.entity.Commande;



/**
 *
 * @author JM
 */
public class CommandeDAO {
      
       
       public List<Commande> rechercherCommandeParId (Long id){
           EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
           Query q = em.createQuery("SELECT c FROM Commande c WHERE c.id LIKE :IDCommande"); //jpql
           q.setParameter("IDCommande", "%" + id + "%");
           return q.getResultList(); 
        } 
       
       
      
       
    
            
            
            
        
}
