package com.spring.mongo.demo.service.impl;


import com.spring.mongo.demo.model.Book;
import com.spring.mongo.demo.repository.BookRepository;
import com.spring.mongo.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;


    @Override
    public Optional<Book> getBookById(Integer id) {
        return bookRepository.getBookByBookId(id);
    }

    @Override
    public List<Book> getBooksByPagesLessThan(Integer pages) {
        return bookRepository.getBooksByPagesLessThan(pages);
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.getBooksByAuthor(author);
    }

    @Override
    public List<Book> getBooksByAuthorAndCost(String author, Double cost) {
        return bookRepository.getBooksByAuthorAndCost(author,cost);
    }

    @Override
    public List<Book> getBooksByAuthorOrName(String author, String name) {
        return bookRepository.getBooksByAuthorOrName(author, name);
    }

    @Override
    public Integer getBooksCountByAuthor(String author) {
        return bookRepository.getBooksCountByAuthor(author);
    }

    @Override
    public List<Book> getBooksByAuthorSortByName(String author) {
        return bookRepository.getBooksByAuthorSortByName(author);
    }

    @Override
    public List<Book> getBookNameAndAuthorByPages(Integer pages) {
        return bookRepository.getBookNameAndAuthorByPages(pages);
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return bookRepository.getAllBooksByAuthor(author);
    }

    @Override
    public List<Book> getBooksByAuthorRegEx(String author) {
        return bookRepository.getBooksByAuthorRegEx(author);
    }

    @Override
    public List<Book> getBooksByAuthorAndCreatedDate(String author, Date start, Date end) {
        return bookRepository.getBooksByAuthorAndCreatedDateRange(author, start, end);
    }
}
