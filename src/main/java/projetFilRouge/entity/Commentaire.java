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
public class Commentaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Column(nullable = false)
    private String commentaire;
    
    @ManyToOne 
    //@JoinColumn(name = "CLEF_ETRANGERE_COMMANDE")  
    //private Article article; C'est la bonne syntaxe.
    private Article articleco;  //fk vers la table commande: 'Commentaire' est proprietaire de la fk commande
    
    //==========================================================================

    public Commentaire() {
    }

    public Commentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Article getArticleco() {
        return articleco;
    }

    public void setArticleco(Article articleco) {
        this.articleco = articleco;
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
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "id=" + id + ", commentaire=" + commentaire + ", articleco=" + articleco + '}';
    }




    
}
