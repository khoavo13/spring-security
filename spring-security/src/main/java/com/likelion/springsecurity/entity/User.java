package com.likelion.springsecurity.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user_db")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
