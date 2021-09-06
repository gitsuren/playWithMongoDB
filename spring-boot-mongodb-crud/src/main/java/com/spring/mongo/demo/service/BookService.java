package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Book;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> getBookById(Integer id);
    List<Book> getBooksByPagesLessThan(Integer pages);
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByAuthorAndCost(String author, Double cost);
    List<Book> getBooksByAuthorOrName(String author, String name);
    Integer getBooksCountByAuthor(String author);
    List<Book> getBooksByAuthorSortByName(String author);
    List<Book> getBookNameAndAuthorByPages(Integer pages);
    List<Book> getAllBooksByAuthor(String author);
    List<Book> getBooksByAuthorRegEx(String author);
    List<Book> getBooksByAuthorAndCreatedDate(String author, Date start, Date end);
    List<Book> findBooksByAuthorAndCreatedDateBetween(String author, Date start, Date end);
    List<Book> findBooksByAuthorAndCreatedDateBetweenUsingMongoTemplate(String author, Date start, Date end);
}
