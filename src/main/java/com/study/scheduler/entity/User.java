package com.study.scheduler.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user")
public class User extends BaseEntity{

    // 유저 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userid;

    // 유저명
    @Column(nullable = false, unique = true)
    private String username;

    // 유저 이메일
    @Column(nullable = false)
    private String email;

    // 생성자


    public User() {
    }

    public User(String username, String email) {
//        this.userid = user;
        this.username = username;
        this.email = email;
    }


//    private Integer age;

//    // 작성일
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createAt;
//
//    // 수정일
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updateAt;
//
//    // Entity가 저장될 떄 자동으로 현재 시간 설정
//    @PrePersist
//    protected void onCreate() {
//        this.createAt = new Date();
//    }
//
//    // Entity가 수정될 때 자동으로 현재 시간 Update
//    @PreUpdate
//    protected void onUpdate() {
//        this.updateAt = new Date();
//    }


}
