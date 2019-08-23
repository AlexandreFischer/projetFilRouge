/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ClientDAOCrud;
import projetFilRouge.entity.Client;
import static projetFilRouge.entity.Client_.mail;
import projetFilRouge.entity.Commentaire;

/**
 *
 * @author alexa
 */
@Transactional
@Service
public class ClientService {
    
    @Autowired
    private ClientDAOCrud dao;
    
    
    public void ajouterClient(Client client){
        if(dao.findAll().equals(client.getMail())){
            System.out.println("Mail déjà existant,Veuillez en choisir un autre");
        }
        else {
             dao.save(client);
             System.out.println("CLIENT AJOUTE");
        }
    }
    
    public void seConnecterAuSite(Client client){
        System.out.println(dao.findByMailAndPassword(client.getMail(), client.getPassword()));
    }
    
    public void supprimerClient(Client client){
        dao.delete(dao.findByNom(client.getNom()));
        System.out.println("CLIENT SUPPRIMER");
    }
    
    public List<Client> afficherListeClients(){
        System.out.println((List<Client>) dao.findAll());
        return (List<Client>) dao.findAll();
    }    
}
