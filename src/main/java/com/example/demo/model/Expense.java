package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;
import java.time.LocalDate;

@Getter
@Setter
public class Expense {

    @Id
    private int id;
    private LocalDate date;
    private String description;
    private double amount;
    private Category category;

    public Expense(int id, LocalDate date, String description, double amount, Category category){
        this.id = id;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
