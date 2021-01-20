package com.howtodoinjava.demo.web;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.UserEntity;
import com.howtodoinjava.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService service;

	@Autowired
	EntityManager em;

/*	@GetMapping("/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		
		EmployeeEntity entity = service.getEmployeeById(id);		
		System.out.println("First Entity "+entity);		
		return new ResponseEntity<EmployeeEntity>(entity, new HttpHeaders(), HttpStatus.OK);
	}*/

	//@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
	@CrossOrigin(origins = "*",allowedHeaders = "*")
	@PostMapping("/users")
	public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity employee)
			throws RecordNotFoundException {
		UserEntity saved = service.saveEmployee(employee);
		return new ResponseEntity<UserEntity>(saved, new HttpHeaders(), HttpStatus.OK);
	}

}