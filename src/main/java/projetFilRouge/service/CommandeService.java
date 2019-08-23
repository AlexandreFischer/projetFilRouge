/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.dao.ClientDAOCrud;
import projetFilRouge.dao.CommandeDAOCrud;
import projetFilRouge.dao.LigneDeCommandeDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.entity.Client;
import projetFilRouge.entity.Commande;
import projetFilRouge.entity.LigneDeCommande;

/**
 *
 * @author alexa
 */

@Transactional
@Service
public class CommandeService {
    
//    @Autowired
//    private ClientDAOCrud daoClient;
//    
//    @Autowired
//    private ArticleDAOCrud daoArticle;
//    
//    @Autowired
//    private LigneDeCommandeDAOCrud daoLigneCommande;
//    
//    @Autowired
//    private CommandeDAOCrud daoCommande;
//    
//    
//
//    public void ajouterPanier(Long idClient, Long idArticle, Long quantite){
//        
//        if(daoCommande.findByEtatDuPanier(Commande.etatPanier) equals(ENCOURS)){
//            dao.save(truc);
//        }
//        
//        else
//            Commande c = new Commande()
//
//        
//      
//        
//    }
    
}
