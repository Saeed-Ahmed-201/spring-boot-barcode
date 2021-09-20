package com.barcode.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barcode.model.Employee;
import com.barcode.service.EmployeeService;
import com.google.zxing.WriterException;

@RestController
public class EmployeeController {
	   @Autowired
	   private EmployeeService employeeService;
	   
	   
	   @PostMapping(value ="/add/employee")
	   public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) throws WriterException, IOException{
		       return ResponseEntity.status(HttpStatus.ACCEPTED)
		    		   .body(employeeService.createEmployee(employee));
	   }

}
