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

    public void ajouterClient(Client client) {
        dao.save(client);
    }

    public void seConnecterAuSite(Client client) {
        System.out.println(dao.findByMailAndPassword(client.getMail(), client.getPassword()));
    }

    public void supprimerClient(String nomClient) {
        dao.delete(dao.findByNom(nomClient));
    }

    public List<Client> afficherListeClients() {
        System.out.println((List<Client>) dao.findAll());
        return (List<Client>) dao.findAll();
    }

    public Client afficherClientParNom(String nomClient) {
        System.out.println(dao.findByNom(nomClient));
        return dao.findByNom(nomClient);
    }

    public Client afficherClientParMail(String mailClient) {
        System.out.println(dao.findByMail(mailClient));
        return dao.findByMail(mailClient);
    }
    
    public Client afficherClientParMailAndPassword(String mailClient, String passwordClient){
        System.out.println(dao.findByMailAndPassword(mailClient, passwordClient));
        return dao.findByMailAndPassword(mailClient, passwordClient);
    }
}
