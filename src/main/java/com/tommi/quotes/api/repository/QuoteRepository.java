package com.tommi.quotes.api.repository;

import com.tommi.quotes.api.model.Quote;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {

    @Query(value = "SELECT * FROM quotes ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Quote getRandomQuote();

    @Query(value = "SELECT * FROM quotes ORDER BY rating DESC LIMIT 5", nativeQuery = true)
    List<Quote> getTopRatedQuotes();
}
