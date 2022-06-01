package com.jhow.demo.response;

import com.jhow.demo.models.Article;

import java.util.ArrayList;

public class AuthorArticles {
    private ArrayList<Article> data;

    private String author;

    private int page;

    private int perPage;

    private int totalPages;

    @Deprecated
    public AuthorArticles(){
    }

    public AuthorArticles(ArrayList<Article> articles, String author, int page, int perPage, int totalPages) {
        this.data = articles;
        this.author = author;
        this.page = page;
        this.perPage = perPage;
        this.totalPages = totalPages;
    }

    public ArrayList<Article> getData() {
        return data;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public int getPerPage() {
        return perPage;
    }

    public int getTotalPages() {
        return totalPages;
    }
}
