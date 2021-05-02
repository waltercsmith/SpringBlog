package com.codeup.springblog.models;
import javax.persistence.*;

@Entity
@Table(name = "repo")
public class Repo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 720)
    private String content;

    public Repo() {}

    public Repo(String title) {}


    public Repo(long id) {
        this.id = id;
    }

    public Repo(String content){ this.content = content}


    public Repo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Repo(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

}
