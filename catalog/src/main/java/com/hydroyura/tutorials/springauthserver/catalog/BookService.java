package com.hydroyura.tutorials.springauthserver.catalog;

import com.github.javafaker.Faker;
import com.hydroyura.tutorials.springauthserver.sharedlibs.Author;
import com.hydroyura.tutorials.springauthserver.sharedlibs.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class BookService {

    private Faker faker = new Faker();
    private List<Book> repository;
    private Integer BOOKS_COUNT = 1_000;
    private Integer AUTHORS_COUNT = 25;


    @PostConstruct
    void initBookRepository() {
        Random random = new Random();
        List<Author> AUTHORS = IntStream.range(0, AUTHORS_COUNT)
            .mapToObj(i -> new Author()
                .setFirstname(faker.name().firstName())
                .setLastname(faker.name().lastName()))
                .collect(Collectors.toCollection(ArrayList::new));
        repository = IntStream.range(0, BOOKS_COUNT)
            .mapToObj(i -> new Book()
                .setId(i)
                .setAuthor(AUTHORS.get(random.nextInt(AUTHORS.size())))
                .setPages(random.nextInt(100, 1000))
                .setTitle(faker.book().title()))
            .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Book> findAllWithLimit(Integer limit) {
        return repository
            .stream()
            .limit(limit)
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
