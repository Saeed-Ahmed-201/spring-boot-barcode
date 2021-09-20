package com.barcode.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barcode.model.Employee;
import com.barcode.repository.EmployeeRepository;
import com.barcode.util.Barcode;
import com.google.zxing.WriterException;

@Service
public class EmployeeService {

	   @Autowired
	   private Barcode barcode;
	   
	   @Autowired
	   private EmployeeRepository employeeRepository;
	   
	   public Employee createEmployee(Employee employee) throws WriterException, IOException {
		   
		      Employee insertedEmployee = this.employeeRepository.save(employee);
		      if(!insertedEmployee.equals(null)) {
		    	  String id = insertedEmployee.getId().toString();
		    	  this.barcode.generateBarCodeImage(id, 350, 350, "d:/" +id+".png");
		      }
		   return insertedEmployee;
		   
	   }
}
