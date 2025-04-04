package com.study.scheduler.entity;


import jakarta.persistence.*;

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
}
