package com.dinesh.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Address implements Serializable{
	
	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "STREETNAME", nullable = false, length = 30)
	private String streetName;
	
	@Column(name = "CITY", nullable = false, length = 30)
	private String city;
	
	@Column(name = "STATE", nullable = false, length = 30)
	private String state;
	
	@Column(name = "COUNTRY", nullable = false, length = 30)
	private String country;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@OneToMany
	private List<Person> personlst;
	
	public List<Person> getPersonlst(){
		return personlst;
	}
	
	public void setPersonlst(List<Person> personlst) {
		this.personlst = personlst;
	}
	
	public Address(Long id, String streetName, String city, String state, String country) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Address() {}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
}
