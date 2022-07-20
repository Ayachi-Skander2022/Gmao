package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Article;
import com.example.demo.service.IArticleService;

@RestController
@RequestMapping("/article")
@CrossOrigin(origins = "http://localhost:4200")
public class articleController {
@Autowired

IArticleService articleService;

@PostMapping("/addArticle")
public Article addArticle(@RequestBody Article article) {
	return articleService.addArticle(article);
}

@PostMapping("/addTestCode")
public String addTestCode (@RequestBody Article article) {
	return articleService.addArticleTestCode(article);
}

@PutMapping("/updateArticle/{id}")
public Article updateArticle(@RequestBody Article article,@PathVariable("id") Long idArticle) {
	return articleService.updateArticle(article, idArticle);
}

@DeleteMapping("/deleteArticle/{id}")
public String deleteArticle(@PathVariable("id") Long idArticle) {
	String msg="";
	articleService.deleteArticle(idArticle);
	return msg;
}

@GetMapping("/findAllArticle")
public List<Article> findAll(){
	return articleService.findAll();
}
}
