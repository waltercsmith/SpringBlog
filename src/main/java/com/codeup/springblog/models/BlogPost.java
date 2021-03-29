package com.codeup.springblog.models;

import javax.persistence.*;


//    This represents data from the database: practiceblog_db
@Entity
@Table(name = "blogpost")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 720)
    private String content;


}


