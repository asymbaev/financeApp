package com.example.financeApp.entity;


import jakarta.persistence.*;

@Entity
public class Amount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private double amount;
    private String history;
    private double value;

    public Amount(Long id, double amount, String history, double value) {
        this.id = id;
        this.amount = amount;
        this.history = history;
        this.value = value;
    }
    public Amount() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
