package com.learning.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // It will map the Java class with database table--Mandatory
@Table(name = "Student_Passport") // you can create custom table name in Database
public class Passport {
	// Attibute level Annotations
	@Id // It will make this property as a Primary key in the database table
	@Column(name = "passport_id")
	@GeneratedValue // It will generate a unique value for this and incrementa automatically
	private int id;
	@Column(name = "passport_number")
	private String passportNumber;
	@Column(name = "Passport_Authority_Name")
	private String authority;

	// Default Constructor

	public Passport() {
	}

	// Parametrized Constructor
	public Passport(String passportNumber, String authority) {
		super();
		this.passportNumber = passportNumber;
		this.authority = authority;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber + ", authority=" + authority + "]";
	}

}
