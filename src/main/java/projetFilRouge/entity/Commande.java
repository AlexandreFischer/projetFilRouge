/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alexa
 */
@Entity
public class Commande implements Serializable {
    
    public enum MoyenDePaiement{
        CARTEBLEU,
        PAYPAL,
        CHEQUE,
        VIREMENT
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Double montantTotal;
    
    @Column(nullable = false)
    private String cgv;
    
    @Column(nullable = false)
    private Integer tva;
    
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Temporal(TemporalType.DATE)
    private Date dateLivraisonCommande;
    
    @Enumerated(EnumType.STRING)
    private MoyenDePaiement moyenDePaiement;
    
    private List<Article> listeArticleReserve = new ArrayList<>();
    
    @ManyToOne()
    private Client client;
    
    //lien vers table Ligne de commande
    @OneToMany(mappedBy = "commande") 
    private List<LigneDeCommande> listeLignedecommande = new ArrayList<>();
    
    //lien vers table Commentaire
    @OneToMany(mappedBy = "commandeCommentaire") 
    private List<Commentaire> commentaires = new ArrayList<>();
    
    
     //lien vers table Reclamation
    @OneToMany(mappedBy = "commandeReclamation")
    private List<Reclamation> reclamations = new ArrayList<>();
    
    //==========================================================================
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetFilRouge.entity.Commande[ id=" + id + " ]";
    }
    
}
