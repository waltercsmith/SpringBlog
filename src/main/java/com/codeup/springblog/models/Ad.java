package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @Column(name = "titles", nullable = false, length = 100)
    private String titles;


    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;



}
