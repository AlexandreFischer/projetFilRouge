/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author alexa
 */
@Entity
public class Article implements Serializable {

    public enum Categorie{
        HOMME,
        FEMME,
        SAC
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String nom;
    
    @Column(length = 1500)
    private String description;
    
    @Column(nullable = false)
    private Double prixHT;
    
    @Column(nullable = false)
    private Integer delaisAppros;
    
    @Column(nullable = false)
    private Integer delaisDeLivraisonArt;
    
    @Column(nullable = false)
    private Integer quantiteStock;
        
    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @OneToMany(mappedBy = "article",cascade = CascadeType.PERSIST)
    private List<LigneDeCommande> listeLigneDeCommandes = new ArrayList<>();
    
    //lien vers table Commentaire
    @OneToMany(mappedBy = "articleco") 
    private List<Commentaire> commentairesArticle = new ArrayList<>();

    public Article(){
        
    }
    public Article(String nom, Double prixHT, Integer delaisAppros, Integer delaisDeLivraisonArt, Integer quantiteStock) {
        this.nom = nom;
        this.prixHT = prixHT;
        this.delaisAppros = delaisAppros;
        this.delaisDeLivraisonArt = delaisDeLivraisonArt;
        this.quantiteStock = quantiteStock;
    }

    public Article(String nom, String description, Double prixHT, Integer delaisAppros, Integer delaisDeLivraisonArt, Integer quantiteStock, Categorie categorie) {
        this.nom = nom;
        this.description = description;
        this.prixHT = prixHT;
        this.delaisAppros = delaisAppros;
        this.delaisDeLivraisonArt = delaisDeLivraisonArt;
        this.quantiteStock = quantiteStock;
        this.categorie = categorie;
    }
    //===========================================================================================================

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Double prixHT) {
        this.prixHT = prixHT;
    }

    public Integer getDelaisAppros() {
        return delaisAppros;
    }

    public void setDelaisAppros(Integer delaisAppros) {
        this.delaisAppros = delaisAppros;
    }

    public Integer getDelaisDeLivraisonArt() {
        return delaisDeLivraisonArt;
    }

    public void setDelaisDeLivraisonArt(Integer delaisDeLivraisonArt) {
        this.delaisDeLivraisonArt = delaisDeLivraisonArt;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<LigneDeCommande> getListeLigneDeCommandes() {
        return listeLigneDeCommandes;
    }

    public void setListeLigneDeCommandes(List<LigneDeCommande> listeLigneDeCommandes) {
        this.listeLigneDeCommandes = listeLigneDeCommandes;
    }
    
    
     public List<Commentaire> getCommentairesArticle() {
        return commentairesArticle;
    }

    //public void setCommentairesArticle(List<Commentaire> commentairesArticle) {
    //     this.commentairesArticle = commentairesArticle;
    //}
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id!= null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", nom=" + nom + ", description=" + description + ", prixHT=" + prixHT + ", delaisAppros=" + delaisAppros + ", delaisDeLivraisonArt=" + delaisDeLivraisonArt + ", quantiteStock=" + quantiteStock + ", categorie=" + categorie + ", listeLigneDeCommandes=" + listeLigneDeCommandes + '}';
    }




}
