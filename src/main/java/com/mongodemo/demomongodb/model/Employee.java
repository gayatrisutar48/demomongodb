package com.mongodemo.demomongodb.model;

//import jdk.jfr.Enabled;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Employee {

    @Id
    String id;
    private String empName;
    private String city;
    private Integer salary;

    private List<String> list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
