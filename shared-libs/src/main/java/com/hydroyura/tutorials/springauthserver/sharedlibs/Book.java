package com.hydroyura.tutorials.springauthserver.sharedlibs;

public class Book {

    private Integer id;
    private String title;
    private Integer pages;
    private Author author;


    public Book() {}


    public Integer getId() {
        return id;
    }

    public Book setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public Book setPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }

}
