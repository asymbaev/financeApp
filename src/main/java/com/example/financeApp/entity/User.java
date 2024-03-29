package com.example.financeApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long Id;

    @Column(nullable = false, unique = true)

    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private  double amount;



    public User() {

    }

    public User(String username, String password, String role, String userId, double amount) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.userId = userId;
        this.amount = amount;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
