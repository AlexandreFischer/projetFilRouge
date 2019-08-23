/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author alexa
 */
@Entity
public class LigneDeCommande implements Serializable {

    public enum TypeLigneDeCommande{
        RESERVE,
        COMMANDE
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long quantiteArticle;
    
    @Enumerated(EnumType.STRING)
    private TypeLigneDeCommande typeLigneDeCommande;
   
  
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getQuantiteArticle() {
        return quantiteArticle;
    }


    public Commande getCommande() {
        return commande;
    }
    
 

    public Long getId() {
        return id;
    }

    @ManyToOne 
    private Article article;
    
    @ManyToOne 
    private Commande commande;
    
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
        if (!(object instanceof LigneDeCommande)) {
            return false;
        }
        LigneDeCommande other = (LigneDeCommande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetFilRouge.entity.LigneDeCommande[ id=" + id + " ]";
    }
    
}
