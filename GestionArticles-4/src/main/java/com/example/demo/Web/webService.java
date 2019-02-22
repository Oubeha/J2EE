package com.example.demo.Web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entities.Article;
import com.example.demo.Entities.ArticleRepository;

@Controller
@RestController
public class webService {
	
	@Autowired
	private ArticleRepository Test;
	
	
	
	public Article save(Article article) {
			return Test.save(article);
	}
	
	public void update(Article article) {
		Test.flush();
	}
	
	public void delete(Article article) {
		Test.delete(article);
	}
	
	public List<Article> findAll() {
		return Test.findAll();
	}
	
	public Article FindByNom(String nom) {
		return Test.findByNom(nom);
	}
	
	

}
