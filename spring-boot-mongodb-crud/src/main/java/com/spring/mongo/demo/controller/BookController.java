package com.spring.mongo.demo.controller;

import com.spring.mongo.demo.model.Book;
import com.spring.mongo.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book-query")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookService.getBookById(id).get();
    }

    @GetMapping("/pages-lt/{pages}")
    public List<Book> getBooksByPagesLessThan(@PathVariable Integer pages) {
        return bookService.getBooksByPagesLessThan(pages);
    }

    @GetMapping("/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("/author-cost/{author}/{cost}")
    public List<Book> getBooksByAuthorAndCost(@PathVariable String author, @PathVariable Double cost) {
        return bookService.getBooksByAuthorAndCost(author, cost);
    }

    @GetMapping("/author-or-name/{author}/{name}")
    public List<Book> getBooksByAuthorOrName(@PathVariable String author, @PathVariable String name) {
        return bookService.getBooksByAuthorOrName(author, name);
    }

    @GetMapping("/author-count/{author}")
    public Integer getBooksCountByAuthor(@PathVariable String author) {
        return bookService.getBooksCountByAuthor(author);
    }

    @GetMapping("/author-sortByName/{author}")
    public List<Book> getBooksByAuthorSortByName(@PathVariable String author) {
        return bookService.getBooksByAuthorSortByName(author);
    }

    @GetMapping("/book-name-author-only-sortByPage/{pages}")
    public List<Book> getBookNameAndAuthorByPages(@PathVariable Integer pages) {
        return bookService.getBookNameAndAuthorByPages(pages);
    }

    @GetMapping("/booksByAuthor/{author}")
    public List<Book> getAllBooksByAuthor(@PathVariable String author) {
        return bookService.getAllBooksByAuthor(author);
    }

    @GetMapping("/booksByAuthorRegex/{author}")
    public List<Book> getBooksByAuthorRegEx(@PathVariable String author) {
        return bookService.getBooksByAuthorRegEx(author);
    }

    @GetMapping("/getBooksByAuthorAndCreatedDate/{author}/{days}")
//    public List<Book> getBooksByAuthorAndCreatedDate(@PathVariable String author, @PathVariable String start, @PathVariable String end ) {
    public List<Book> getBooksByAuthorAndCreatedDate(@PathVariable String author, @PathVariable Integer days) {
        Date startDate = Date.from(Instant.now().minus(Duration.ofDays(days)));
        Date endDate = Date.from(Instant.now());

        try {
            return bookService.getBooksByAuthorAndCreatedDate(author, startDate, endDate);
        } catch (Exception e) {
            System.out.println(e);
            System.out.printf("SMTHING WENT WRONG!!!");
            return null;
        }

    }

    @GetMapping("/findBooksByAuthorAndCreatedDateBetween/{author}/{days}")
    public List<Book> findBooksByAuthorAndCreatedDateBetween(@PathVariable String author, @PathVariable Integer days) {
        Date startDate = Date.from(Instant.now().minus(Duration.ofDays(days)));
        Date endDate = Date.from(Instant.now());
        return bookService.findBooksByAuthorAndCreatedDateBetween(author, startDate, endDate);
    }

    @GetMapping("/findBooksByAuthorAndCreatedDateBetweenUsingMongoTemplate/{author}/{days}")
    public List<Book> findBooksByAuthorAndCreatedDateBetweenUsingMongoTemplate(@PathVariable String author, @PathVariable Integer days) {
        Date startDate = Date.from(Instant.now().minus(Duration.ofDays(days)));
        Date endDate = Date.from(Instant.now());
        return bookService.findBooksByAuthorAndCreatedDateBetweenUsingMongoTemplate(author, startDate, endDate);
    }


    @GetMapping("/getBooksByAuthorAndCreatedDate/{author}/{startStr}/{endStr}")
    public List<Book> getBooksByAuthorAndCreatedDate(@PathVariable String author, @PathVariable String startStr, @PathVariable String endStr) {
        return bookService.getBooksByAuthorAndCreatedDate(author, getDate(startStr),getDate(endStr));
    }


    private Date getDate(String dateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSX");
        OffsetDateTime time = OffsetDateTime.parse(dateStr, formatter);
//        OffsetDateTime time = OffsetDateTime.parse("2014-02-27 16:41:51.863092+01", formatter);
        //in database: 2021-09-04T23:30:00.000+00:00
        System.out.println(Timestamp.from(time.toInstant()));
        return Date.from(time.toInstant());
    }
 }
