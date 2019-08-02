package com.mongodemo.demomongodb.controller;


import com.mongodemo.demomongodb.model.Employee;
import com.mongodemo.demomongodb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value = "/saveemp")
    public String saveEmp(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "Data saved";
    }

    @GetMapping(value = "/delemp/{id}")
    public String delEmp(@PathVariable Integer id) {
        employeeRepo.delete(id);
        return "Data deleted";

    }

}
