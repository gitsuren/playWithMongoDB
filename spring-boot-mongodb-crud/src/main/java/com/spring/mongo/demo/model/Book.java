package com.spring.mongo.demo.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Book {

    @Id
    private String id;

    private Integer bookId;
    private String name;
    private Integer pages;
    private String author;
    private Double cost;
    private Date createdDate;
}
