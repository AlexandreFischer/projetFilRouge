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
    
    @Autowired
    private ClientDAOCrud daoClient;
//    
    @Autowired
    private ArticleDAOCrud daoArticle;
//    
//    @Autowired
//    private LigneDeCommandeDAOCrud daoLigneCommande;
//    
    @Autowired
    private CommandeDAOCrud daoCommande;
//    
//    
//
    public void ajouterPanier(long idClient, long idArticle, long quantite){
        
        // Recupere la commande EN COURS du client idClient si elle existe, sinon on en cree une nouvelle
        Commande commande = this.daoCommande.findOneByClientIdAndEtatPanier(idClient, Commande.EtatPanier.ENCOURS);
        if( commande==null ){
            commande = new Commande();
            
            // Recup client et l associe a la commande
            Client cli = daoClient.findOne(idClient);
            
            cli.getListeCommandes().add(commande);
            commande.setClient(cli);
        }
        
        
        // Cree nouv ligne de commande que j associe a la commande
        LigneDeCommande ligneCmd = new LigneDeCommande();
        ligneCmd.setCommande(commande);
        commande.getListeLignedecommande().add(ligneCmd);
        
        // Recup article a partir de son id et l assoc ligne com + quantite
        Article art = daoArticle.findOne(idArticle);
        art.getListeLigneDeCommandes().add(ligneCmd);
        ligneCmd.setArticle(art);
        ligneCmd.setQuantiteArticle(quantite);
        
        // Maj / ajoute de la commande et on est ok
        daoCommande.save(commande);
    }
    
}
