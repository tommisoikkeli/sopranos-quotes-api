package com.tommi.quotes.api.repository;

import com.tommi.quotes.api.model.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {

}
