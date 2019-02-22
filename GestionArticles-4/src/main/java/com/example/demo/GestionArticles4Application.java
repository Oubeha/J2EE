package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entities.Article;
import com.example.demo.Entities.ArticleRepository;

@SpringBootApplication
public class GestionArticles4Application implements CommandLineRunner {
	
   @Autowired
   private ArticleRepository art;

   
   public static void main(String[] args) {
          SpringApplication.run(GestionArticles4Application.class, args);
	                                       }

    @Override
    public void run(String... args) throws Exception {
    	
    	DateFormat df = new SimpleDateFormat("dd/yy/yyyy");
    	
    	art.save(new Article("ali", 21, 33, df.parse("22/12/1889"),"Image.jpg"));
	    
        art.save(new Article("noureddine", 15, 222, df.parse("02/12/1991"),"image2.jpg"));
		art.save(new Article("amine", 89, 245, df.parse("22/13/1890"),"image3.jpg"));
		art.save(new Article("mohammed", 01, 122, df.parse("22/20/1329"),"image4.jpg"));
	    art.save(new Article("yousef", 34, 245, df.parse("22/24/1997"),"image5.jpg"));
	    
	  List<Article>  articles = art.findAll();
	  for(Article art : articles) {
		  System.out.println(art);
	  }
	 
	}
	
		

		
	

}
