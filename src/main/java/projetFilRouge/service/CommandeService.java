/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
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
  
    @Autowired
    private ArticleDAOCrud daoArticle;
//    
//    @Autowired
//    private LigneDeCommandeDAOCrud daoLigneCommande;
//    
    @Autowired
    private CommandeDAOCrud daoCommande;

//    public void ajouterPanier(long idClient, long idArticle, long quantite) { // Créé la ligne avec l'idArticle associé mais pas l'idCommande
//
//        // Recupere la commande EN COURS du client idClient si elle existe, sinon on en cree une nouvelle
//        Commande commande = this.daoCommande.findOneByClientIdAndEtatPanier(idClient, Commande.EtatPanier.ENCOURS);
//        System.out.println("1-COMMANDE RECUPERE : " + commande);
//        if (commande == null) {
//            commande = new Commande();
//            System.out.println("2-NOUVELLE COMMANDE CREE : " + commande);
//            // Recup client et l associe a la commande
//            Client cli = daoClient.findOne(idClient);
//            System.out.println("3-CLIENT RECUPERE : " + cli);
//            //cli.getListeCommandes().add(commande);
//            System.out.println("4-AJOUT COMMANDE A LA LISTE DE COMMANDE DU CLIENT : " + cli.getListeCommandes().add(commande));
//            System.out.println("5-ASSOCIATION DE LA COMMANDE AU CLIENT : ");
//            commande.setClient(cli);
//
//        } else {
//            System.out.println("6-COMMANDE DEJA EXISTANTE DU COUP ON PASSE A LA SUITE");
//        }
//
//        // Cree nouv ligne de commande que j associe a la commande
//        LigneDeCommande ligneCmd = new LigneDeCommande();
//        System.out.println("7-NOUVELLE LIGNE DE COMMANDE CREE : " + ligneCmd);
//        //ligneCmd.setCommande(commande);
//
//        // Recup article a partir de son id et l assoc ligne com + quantite
//        Article art = daoArticle.findOne(idArticle);
//        System.out.println("8-RECUPERATION DE L'ARTICLE PAR SON ID : " + art);
//        // CETTE LIGNE PLANTE TOUT //art.getListeLigneDeCommandes().add(ligneCmd);
//        ligneCmd.setArticle(art);
//        System.out.println("9-SET L'ARTICLE A LA LIGNE DE COMMANDE : " + ligneCmd);
//        ligneCmd.setQuantiteArticle(quantite);
//        System.out.println("10-SET LA QUANTITE A LA LIGNE DE COMMANDE : " + ligneCmd);
//
//        commande.getListeLignedecommande().add(ligneCmd);
//        System.out.println("11-AJOUTE LA LIGNE DE COMMANDE A LA LISTE DE LIGNES DE COMMANDES DE LA COMMANDE : " + commande);
//
//        // Maj / ajoute de la commande et on est ok
//        daoCommande.save(commande);
//        System.out.println("12-AJOUT DE LA COMMANDE EN BASE DE DONNEES");
//    }
    
//    public void ajouterPanier(long idClient, long idArticle, long quantite){
//        
//        // Recupere la commande EN COURS du client idClient si elle existe, sinon on en cree une nouvelle
//        Commande commande = this.daoCommande.findOneByClientIdAndEtatPanier(idClient, Commande.EtatPanier.ENCOURS);
//        System.out.println("1-COMMANDE RECUPERE : " + commande);
//        if(commande == null){
//            commande = new Commande();
//            System.out.println("2-NOUVELLE COMMANDE CREE : " + commande);
//            // Recup client et l associe a la commandes
//            Client cli = daoClient.findOne(idClient);
//            System.out.println("3-CLIENT RECUPERE : " + cli);
//            System.out.println("4-AJOUT COMMANDE A LA LISTE DE COMMANDE DU CLIENT : ");
//            cli.getListeCommandes().add(commande);
//            System.out.println("5-ASSOCIATION DE LA COMMANDE AU CLIENT : ");
//            commande.setClient(cli);
//            System.out.println("5.5- VERIFICATION ASSOCIATION : " + commande);  
//        }
//        else {
//            System.out.println("6-COMMANDE DEJA EXISTANTE DU COUP ON PASSE A LA SUITE");
//        }

//        // Cree nouv ligne de commande que j associe a la commande
//        LigneDeCommande ligneCmd = new LigneDeCommande();
//        System.out.println("7-NOUVELLE LIGNE DE COMMANDE CREE : " + ligneCmd);
//        ligneCmd.setCommande(commande);
//        commande.getListeLignedecommande().add(ligneCmd);
//        
//        // Recup article a partir de son id et l assoc ligne com + quantite
//        Article art = daoArticle.findOne(idArticle);
//        System.out.println("8-RECUPERATION DE L'ARTICLE PAR SON ID : " + art);
//        art.getListeLigneDeCommandes().add(ligneCmd);
//        ligneCmd.setArticle(art);
//        System.out.println("9-SET L'ARTICLE A LA LIGNE DE COMMANDE : " + ligneCmd);
//        ligneCmd.setQuantiteArticle(quantite);
//        System.out.println("10-SET LA QUANTITE A LA LIGNE DE COMMANDE : " + ligneCmd);
//        
//        // Maj / ajoute de la commande et on est ok
//        daoCommande.save(commande);
//        System.out.println("11-AJOUT DE LA COMMANDE EN BASE DE DONNEES");
//    }
    
    
//    public List<Commande> afficherListeCommande(){
//        return (List<Commande>) daoCommande.findAll();
//    }

}
