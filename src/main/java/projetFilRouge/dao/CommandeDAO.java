/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

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

    public void ajouterCommande(Commande c) {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(c);   //persister en 2º le film 
        em.getTransaction().commit();
        em.close();
    }

    /*
    public void supprimerCommande(Commande c) {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        em.getTransaction().begin();
        em.remove(c);   //persister en 2º le film 
        em.getTransaction().commit();
        em.close();
    }
     */

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        Query q = em.createQuery("DELETE FROM Commande c WHERE c.id=:ID"); //jpql
        q.setParameter("ID", id);

    }

    public void modifierCommande(Commande c) {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        em.close();
    }
   
    /*
    public void modifierCommandeParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        em.getTransaction().begin();
        Commande c = em.find(Commande.class, (long) id);
        em.merge(c);
        em.getTransaction().commit();
        em.close();
    }
*/

    public Commande rechercherCommandeParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        Query q = em.createQuery("SELECT c FROM Commande c WHERE c.id=:IDCommande"); //jpql
        q.setParameter("IDCommande", id);
        return (Commande) q.getSingleResult();
    }

    public List<Commande> obtenirToutesLesCommandes() {
        EntityManager em = Persistence.createEntityManagerFactory("projetFilRouge_PU").createEntityManager();
        Query q = em.createQuery("SELECT c FROM Commande c");
        return q.getResultList();
    }

}
