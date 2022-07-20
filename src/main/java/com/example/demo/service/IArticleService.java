package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Article;

public interface IArticleService {

	public Article addArticle(Article article);
	public String addArticleTestCode(Article article);
	public Article updateArticle(Article article, Long idArticle);
	public void deleteArticle (Long idArticle);
	public List<Article> findAll();
}
