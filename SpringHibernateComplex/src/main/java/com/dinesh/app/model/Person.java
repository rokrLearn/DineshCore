package com.dinesh.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "FIRSTNAME", nullable = false, length = 30)
	private String firstName;
	
	@Column(name = "LASTNAME", nullable = false, length = 30)
	private String lastName;
	
	@Column(name = "GENDER", nullable = false, length = 6)
	@Enumerated(EnumType.STRING)
	private Gender gender;

	public Gender getGender() {
		return gender;
	}
	
	@Column(name = "AGE", nullable = false, length = 3)
	private String age;
	
	
	@Column(name = "BLOODGROUP", nullable = false, length = 20) 
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;
	 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAge() { return age; } 
	public void setAge(String age) {
	  this.age = age; }
	 
	  public BloodGroup getBloodGroup() { 
		  return bloodGroup; 
	  } 
	  
	  public void setBloodGroup(BloodGroup bloodGroup) {
		  this.bloodGroup = bloodGroup; 
	  }
	
	@ManyToOne(fetch=FetchType.LAZY)  
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Person(Long id, String firstName, String lastName, Gender gender, 
			String age, BloodGroup bloodGroup) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}
	
	public Person() {};
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender.getValue()
				+ ", age=" + age + ", bloodGroup=" + bloodGroup.getValue() + "]";
	}
	
}
