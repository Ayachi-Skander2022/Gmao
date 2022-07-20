package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Article;
import com.example.demo.repository.articleRepo;
@Service
public class articleServiceImp implements IArticleService {
@Autowired
articleRepo ar;
	@Override
	public Article addArticle(Article article) {
		// TODO Auto-generated method stub
		return ar.save(article);
	}
	@Override
	public String addArticleTestCode(Article article) {
		String msg="";
     if(ar.existsByCodeArticle(article.getCodeArticle())) {
    	 msg="Article existe déjat!!";
     }
     else {
    	 ar.save(article);
    	 msg="Article ajouté avec succés";
     }
		return msg;
	}
	@Override
	public Article updateArticle(Article article, Long idArticle) {
        Article a=ar.findById(idArticle).get();
        
        a.setCodeArticle(article.getCodeArticle());
        a.setDesignation(article.getDesignation());
        a.setEmplacement(article.getEmplacement());
        a.setFamille(article.getFamille());
        a.setPrixUnitaire(article.getPrixUnitaire());
        a.setQuantite(article.getQuantite());
        a.setQuantiteMin(article.getQuantiteMin());
        a.setUnite(article.getUnite());
        
		return ar.save(a);
	}
	@Override
	public void deleteArticle(Long idArticle) {
		// TODO Auto-generated method stub
		ar.deleteById(idArticle);
	}
	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return (List<Article>) ar.findAll();
	}

}
