package com.study.scheduler.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "scheduler")
public class Scheduler extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String title;


    @Column(columnDefinition = "longtext")
    private String contents;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Scheduler() {

    }

    public Scheduler(String title, String contents){
        this.title = title;
        this.contents = contents;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
