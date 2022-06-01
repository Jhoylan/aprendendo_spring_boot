package com.jhow.demo.controllers;

import com.jhow.demo.response.AuthorArticles;
import com.jhow.demo.services.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {
    @GetMapping("/articles")
    public AuthorArticles getArticles(@RequestParam(value = "author") String author){
        var articles = ArticleService.findByAuthor(author);
        // this is just a fake pagination
        AuthorArticles response = new AuthorArticles(articles, author, 1, articles.toArray().length, 1);
        return response;
    }
}
