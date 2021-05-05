package com.dinesh.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.app.model.Address;
import com.dinesh.app.model.Person;
import com.dinesh.app.service.PersonService;

@RestController
public class HomeController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/person/{id}")
	public Person getPersonDetailsById(@PathVariable Long id){
		Person person = new Person();
		if(null != id)
			person = personService.getPersonDetailsById(id);
		else
			person = null;
		return person;
	}
	
	@PutMapping("/person/")
	public Person addPersonDetails() {
		Person person = personService.addPersonDetails();
		
		return person;
	}

	@PutMapping("/address/")
	public Address addAddressDetails() {
		Address address = personService.addAddressDetails();
		return address;
	}
}
