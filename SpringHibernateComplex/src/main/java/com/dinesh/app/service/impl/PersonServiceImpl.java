package com.dinesh.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.app.model.Address;
import com.dinesh.app.model.BloodGroup;
import com.dinesh.app.model.Gender;
import com.dinesh.app.model.Person;
import com.dinesh.app.repository.AddressRepository;
import com.dinesh.app.repository.PersonRepository;
import com.dinesh.app.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	public Person getPersonDetailsById(Long id) {
		Person person = new Person();
		if(null != id)
			person = personRepository.findById(id).get();
		else
			person = null;
		return person;
	}

	@Override
	public Person addPersonDetails() {
		List<Person> personlst = new ArrayList<>();
		
		Person p = new Person(1l, "Dinesh", "Purty", 
				Gender.MALE, "29", BloodGroup.B_RhD_POSITIVE);
		
		personlst.add(p);
		
		p = new Person(2l, "Sagar", "Agarwal",
				Gender.MALE, "30", BloodGroup.O_RhD_POSITIVE);
		
		personlst.add(p);
		
		p = new Person(3l, "Ketki", "Mali",
				Gender.FEMALE, "31", BloodGroup.AB_RhD_POSITIVE);
		
		personlst.add(p);
		
		p = new Person(4l, "Sahil", "Sharma",
				Gender.MALE, "28", BloodGroup.B_RhD_POSITIVE);
		
		personlst.add(p);
		
		for(Person pe : personlst) {
			System.out.println("print the object ::"
					+ pe);
			personRepository.save(pe);
		}
		
		return p;
	}
	
	public Address addAddressDetails() {
		List<Address> addresslst = new ArrayList<>();
		
		Address a = new Address(1l, "MG Road", "Pune",
				"Maharashtra", "india");
		
		addresslst.add(a);
		
		a = new Address(2l, "Bhumkar Chowk", "Pune",
				"Maharashtra", "india");
		
		addresslst.add(a);
		
		a = new Address(3l, "Ravet", "Pune",
				"Maharashtra", "india");
		
		addresslst.add(a);
		
		a = new Address(4l, "Baner", "Pune",
				"Maharashtra", "india");
		
		addresslst.add(a);
		
		for(Address ad : addresslst) {
			System.out.println("Print the address object :: "
					+ad);
			
			addressRepository.save(ad);
		}
		
		return a;
	}
}
