package com.spring.mongo.demo.repository.impl;

import com.mongodb.MongoTimeoutException;
import com.spring.mongo.demo.model.Book;
import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.repository.BookCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class BookCustomRepositoryImpl implements BookCustomRepository
{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Book> findBooksByAuthorAndCreatedDateBetween(String author, Date start, Date end) {
        Query query = new Query();
        query.addCriteria(Criteria.where("createdDate")
                .gte(start)
                .lt(end)
                .andOperator(Criteria.where("author").is(author))
        );
        return mongoTemplate.find(query, Book.class);
    }
}
