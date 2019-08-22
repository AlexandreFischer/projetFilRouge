/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import projetFilRouge.dao.ArticleDAOCrud;
import projetFilRouge.entity.Article;
import projetFilRouge.spring.SpringConfig;

/**
 *
 * @author JM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Rollback(false)
@Transactional
public class ArticleDAOTest {
    
    @Autowired  
    private ArticleDAOCrud dao;
    
    @Test
    public void ajouterArticleOK(){
        Article a = new Article("TROTINETTE", 54.5, 5, 6,50);
        dao.save(a);
    }
    /*
    @Test
    public void modifierArticleOK(){
        
    }
    
    @Test
    public void supprimerArticleOK(){
        
    }*/
   
    
}
