package com.barcode;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.barcode.util.Barcode;


@SpringBootApplication
@ComponentScan(basePackages = "com.barcode")
public class BarcodeApplication {
	
	 @Autowired
	   private Barcode barcode;
	 
	public static void main(String[] args) {
		SpringApplication.run(BarcodeApplication.class, args);
	}
	
	
}
