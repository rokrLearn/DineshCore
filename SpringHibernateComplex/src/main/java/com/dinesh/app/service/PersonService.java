package com.dinesh.app.service;

import com.dinesh.app.model.Address;
import com.dinesh.app.model.Person;

public interface PersonService {

	public Person getPersonDetailsById(Long id);
	
	public Person addPersonDetails();
	
	public Address addAddressDetails();
}
