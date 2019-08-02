package com.mongodemo.demomongodb.repository;

import com.mongodemo.demomongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {


    String delete(Integer id);
}
