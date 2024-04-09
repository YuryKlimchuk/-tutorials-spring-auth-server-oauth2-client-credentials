package com.hydroyura.tutorials.springauthserver.onlineshop;

import com.hydroyura.tutorials.springauthserver.sharedlibs.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collection;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId;

@Controller
public class ProductController {

    @Autowired
    private WebClient webClient;

    @GetMapping
    public String showProducts(Model model) {
        Collection<Book> books = webClient
            .get()
            .uri("http://localhost:8081/api/books")
            .attributes(clientRegistrationId("catalog"))
            .retrieve()
            .bodyToFlux(Book.class)
            .toStream()
            .toList();

        model.addAttribute("books", books);
        return "products-list";
    }
}
