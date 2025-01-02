package com.example.demo.controller;

import com.example.demo.model.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
public class ExpenseController {

    @GetMapping("/api/expense/{resourceId}")
    public String getExpense(@PathVariable String resourceId){
        return "This is an expense " + resourceId;
    }

    @PostMapping("/api/expense")
    public Expense createExpense(@RequestBody Expense expense){
        Expense expense1 = new Expense(99, LocalDate.ofEpochDay(1-1-2025), "test", 500.50, Category.MISC);
        return expense1;
    }


}
