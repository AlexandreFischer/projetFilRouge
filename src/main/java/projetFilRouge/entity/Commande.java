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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    public void setMoyenDePaiement(String paypal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
    
    
    //private List<Article> listeArticleReserve = new ArrayList<>();
    
    @ManyToOne()
    private Client client;
    
    //lien vers table Ligne de commande
    @OneToMany(mappedBy = "commande", cascade = CascadeType.PERSIST)  
    private List<LigneDeCommande> listeLignedecommande = new ArrayList<>();
    
    //lien vers table Commentaire
    @OneToMany(mappedBy = "commandeCommentaire") 
    private List<Commentaire> commentaires = new ArrayList<>();
    
    
     //lien vers table Reclamation
    @OneToMany(mappedBy = "commandeReclamation")
    private List<Reclamation> reclamations = new ArrayList<>();
    
    //==========================================================================
    
    
    public Commande(){}

    //==========================================================================

    public Commande(Double montantTotal, String cgv, Integer tva) {
        this.montantTotal = montantTotal;
        this.cgv = cgv;
        this.tva = tva;
    }

    public Commande(Double montantTotal, String cgv, Integer tva, Date date, Client client) {
        this.montantTotal = montantTotal;
        this.cgv = cgv;
        this.tva = tva;
        this.date = date;
        this.client = client;
    }
    
    
    

    public Double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getCgv() {
        return cgv;
    }

    public void setCgv(String cgv) {
        this.cgv = cgv;
    }

    public Integer getTva() {
        return tva;
    }

    public void setTva(Integer tva) {
        this.tva = tva;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateLivraisonCommande() {
        return dateLivraisonCommande;
    }

    public void setDateLivraisonCommande(Date dateLivraisonCommande) {
        this.dateLivraisonCommande = dateLivraisonCommande;
    }

    public MoyenDePaiement getMoyenDePaiement() {
        return moyenDePaiement;
    }

    public void setMoyenDePaiement(MoyenDePaiement moyenDePaiement) {
        this.moyenDePaiement = moyenDePaiement;
    }

//    public List<Article> getListeArticleReserve() {
//        return listeArticleReserve;
//    }
//
//    public void setListeArticleReserve(List<Article> listeArticleReserve) {
//        this.listeArticleReserve = listeArticleReserve;
//    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<LigneDeCommande> getListeLignedecommande() {
        return listeLignedecommande;
    }

    public void setListeLignedecommande(List<LigneDeCommande> listeLignedecommande) {
        this.listeLignedecommande = listeLignedecommande;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(List<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }
    
    
    
    

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
        return "Commande{" + "id=" + id + ", montantTotal=" + montantTotal + ", cgv=" + cgv + ", tva=" + tva + ", date=" + date + ", dateLivraisonCommande=" + dateLivraisonCommande + ", moyenDePaiement=" + moyenDePaiement + ", client=" + client + '}';
    }


    
}
