package com.in.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@GetMapping("/show")
	public ResponseEntity<String> show(){
		System.out.println("sonu");
		String body="this is Spring Rest App";
		ResponseEntity<String> res=new ResponseEntity<String>(body,HttpStatus.OK);
		return res;	
	}
	
}
