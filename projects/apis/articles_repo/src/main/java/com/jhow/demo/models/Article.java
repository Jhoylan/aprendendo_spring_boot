package com.jhow.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "ARTICLE")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name = "TITLE", length = 50)
    private String title;

    @Column(name = "URL", length = 100, nullable = false)
    private String url;

    @Column(name = "AUTHOR", length = 50, nullable = false)
    private String author;

    @Column(name = "NUM_COMMENTS", length = 50, nullable = false)
    private int num_comments;

    @Column(name = "STORY_ID", length = 50)
    private String storyId;

    @Column(name = "STORY_TITLE", length = 50)
    private String storyTitle;

    @Column(name = "STORY_URL", length = 50)
    private String storyUrl;

    @Column(name = "PARENT_ID", length = 50)
    private String parentId;

    @Column(name = "CREATED_AT", length = 50)
    private String createdAt;

    @Deprecated
    public Article() {
    }

    public Article(String title, String url, String author, int num_comments, String storyTitle, String storyUrl) {
        this.title = title;
        this.url = url;
        this.author = author;
        this.num_comments = num_comments;
        this.storyTitle = storyTitle;
        this.storyUrl = storyUrl;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }

    public int getNum_comments() {
        return num_comments;
    }

    public String getStoryId() {
        return storyId;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public String getStoryUrl() {
        return storyUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString(){
        return "Article{" +
                "id=" + id +
                ", title=" + title +
                ", author=" + author +
                '}';
    }
}




