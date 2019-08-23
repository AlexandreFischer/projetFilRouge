/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import org.springframework.data.repository.CrudRepository;
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Client;

/**
 *
 * @author JM
 */
public interface ClientDAOCrud extends CrudRepository<Client, Long>{
    
    Client findByNom(String nom);
    Client findByMail(String mail);
    Client findByMailAndPassword(String mail, String password);

 

    
}
