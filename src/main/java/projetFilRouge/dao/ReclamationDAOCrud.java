/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import projetFilRouge.entity.Reclamation;

/**
 *
 * @author JM
 */
public interface ReclamationDAOCrud extends CrudRepository<Reclamation, Long>{
    
}
