package com.jhow.demo.repos;

import com.jhow.demo.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
