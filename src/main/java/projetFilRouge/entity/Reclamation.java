/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author alexa
 */
@Entity
public class Reclamation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String reclamation;
    
    
    @ManyToOne 
    //@JoinColumn(name = "CLEF_ETRANGERE_COMMANDE")  
    private Commande commandeReclamation; //fk vers la table commande: 'Reclamation' est proprietaire de la fk commande
    
   //==========================================================================

    public Reclamation() {
    }

    public Reclamation(String reclamation) {
        this.reclamation = reclamation;
    }

    public Reclamation(String reclamation, Commande commandeReclamation) {
        this.reclamation = reclamation;
        this.commandeReclamation = commandeReclamation;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReclamation() {
        return reclamation;
    }

    public void setReclamation(String reclamation) {
        this.reclamation = reclamation;
    }

    public Commande getCommandeReclamation() {
        return commandeReclamation;
    }

    public void setCommandeReclamation(Commande commandeReclamation) {
        this.commandeReclamation = commandeReclamation;
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
        if (!(object instanceof Reclamation)) {
            return false;
        }
        Reclamation other = (Reclamation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id=" + id + ", reclamation=" + reclamation + ", commandeReclamation=" + commandeReclamation + '}';
    }

}
