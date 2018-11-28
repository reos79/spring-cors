package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping("/persons")
	public Person findAllPersons() {
		Person p = new Person();
		p.setName("Rommel");
		return p;
	}
	
	@PostMapping("/persons")
	public Person createPerson(@RequestBody Person p) {		
		return p;
	}
}
