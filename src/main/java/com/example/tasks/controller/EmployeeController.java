package com.example.tasks.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/employee")
public class EmployeeController {

    @PatchMapping("/{id}/adress")
    public void updateEmployeeAdress(@PathVariable Long id,
                                     @RequestParam(value = "value") String adress) {
        System.out.println("Employee with id " + id + " updated adress " + " new adress is " + adress);

    }
}