package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Book;

import java.util.Date;
import java.util.List;

public interface BookCustomRepository {
    List<Book> findBooksByAuthorAndCreatedDateBetween(String author, Date start, Date end);
}
