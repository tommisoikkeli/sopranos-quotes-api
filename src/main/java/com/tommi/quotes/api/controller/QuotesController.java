package com.tommi.quotes.api.controller;

import com.tommi.quotes.api.model.Quote;
import com.tommi.quotes.api.repository.QuoteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesController {

    @Autowired
    private QuoteRepository quoteRepository;

    @GetMapping("/quotes")
    public List<Quote> getQuotes() {
        return (List<Quote>)quoteRepository.findAll();
    }

    @GetMapping("/quotes/{id}")
    public Quote getQuoteById(@PathVariable("id") Long id) {
        return quoteRepository.findById(id)
                .orElse(null);
    }

}
