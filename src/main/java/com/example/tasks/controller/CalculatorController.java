package com.example.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/calculator")
public class CalculatorController {
    @GetMapping
    public Object calculator(@RequestParam Long num1,
                             @RequestParam String operation,
                             @RequestParam Long num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return "You entered invalid characters \nplus='+'\nminus='-'\nmultiplication='*'\ndivision='/'";

        }
    }
}
