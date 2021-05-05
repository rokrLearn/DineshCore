package com.dinesh.app.model;

public enum BloodGroup {

	
	  A_RhD_POSITIVE("A+"), A_RhD_NEGATIVE("A-"), B_RhD_POSITIVE("B+"),
	  B_RhD_NEGATIVE("B-"), O_RhD_POSITIVE("O+"), O_RhD_NEGATIVE("O-"),
	  AB_RhD_POSITIVE("AB+"), AB_RhD_NEGATIVE("AB-");
	
	  private final String value;
	  
	  private BloodGroup(String value) { this.value=value; }
	  
	  public String getValue() {
		  return value;
	  }
	 
}
