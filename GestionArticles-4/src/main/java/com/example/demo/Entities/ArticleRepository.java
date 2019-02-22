package com.example.demo.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	@Query("select a from Article a where a.nom =:x")
	public Article findByNom(@Param("x")String nom);

}
