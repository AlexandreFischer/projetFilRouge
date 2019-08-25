/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import projetFilRouge.entity.Commande;


/**
 *
 * @author JM
 */
public interface CommandeDAOCrud extends CrudRepository<Commande, Long>{
    
    Commande findOneByClientId(long id);
    List<Commande> findByDate(Date date);
    List<Commande> findByClient(String client);
    Long countByEtatPanier(Commande.EtatPanier etatPanier);
    Commande findOneByClientIdAndEtatPanier(long idClient, Commande.EtatPanier etatPanier);
    
}
