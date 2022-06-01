package com.jhow.demo.services;

import com.jhow.demo.models.Article;
import com.jhow.demo.repos.ArticleRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ArticleService implements ApplicationRunner {
    private static ArticleRepository articleRepository;

    private static final Logger LOGGER = Logger.getLogger(ArticleService.class.getName());

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public static ArrayList<Article> findByAuthor(String author){
        var articles = articleRepository.findAll();
        ArrayList<Article> authorArticles = new ArrayList<>();

        for(Article article : articles){
            if(article.getAuthor().equals((author))){
                authorArticles.add(article);
            }
        }

        return authorArticles;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.log(Level.INFO, "Persist");
        var foo_article_1 = new Article("foo_title_1", "http://localhost:8080/articles?author=foo_author_1",
                "foo_author_1", 1, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_1);
        LOGGER.log(Level.INFO, foo_article_1.toString());

        LOGGER.log(Level.INFO, "Persist");
        var foo_article_2 = new Article("foo_title_2", "http://localhost:8080/articles?author=foo_author_1",
                "foo_author_1", 2, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_2);
        LOGGER.log(Level.INFO, foo_article_2.toString());

        LOGGER.log(Level.INFO, "Persist");
        var foo_article_3 = new Article("foo_title_3", "http://localhost:8080/articles?author=foo_author_1",
                "foo_author_1", 3, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_3);
        LOGGER.log(Level.INFO, foo_article_3.toString());

        LOGGER.log(Level.INFO, "Persist");
        var foo_article_4 = new Article("foo_title_4", "http://localhost:8080/articles?author=foo_author_2",
                "foo_author_2", 4, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_4);
        LOGGER.log(Level.INFO, foo_article_4.toString());

        LOGGER.log(Level.INFO, "Persist");
        var foo_article_5 = new Article("foo_title_5", "http://localhost:8080/articles?author=foo_author_2",
                "foo_author_2", 5, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_5);
        LOGGER.log(Level.INFO, foo_article_5.toString());

        LOGGER.log(Level.INFO, "Persist");
        var foo_article_6 = new Article("foo_title_6", "http://localhost:8080/articles?author=foo_author_2",
                "foo_author_2", 6, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_6);
        LOGGER.log(Level.INFO, foo_article_6.toString());

        LOGGER.log(Level.INFO, "Persist");
        var foo_article_7 = new Article("foo_title_7", "http://localhost:8080/articles?author=foo_author_2",
                "foo_author_2", 7, "foo_story_title", "foo_story_url");
        articleRepository.save(foo_article_7);
        LOGGER.log(Level.INFO, foo_article_7.toString());
    }
}
