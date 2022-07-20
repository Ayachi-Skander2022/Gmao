package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Article;

@Repository
public interface articleRepo extends CrudRepository<Article,Long>{

	boolean existsByCodeArticle(String codeArticle);
}
