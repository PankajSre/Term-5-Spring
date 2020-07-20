package com.learning.hibernate.model;

public class Student {
	//id will work as a primary key
	private int id;
	private String username;
	private String password;
	private String email;
	private long phone;
	private String gender;
	private String address;
// Default Constructor
	public Student() {
	}
   // Parametrized constructor
	public Student(int id, String username, String password, String email, long phone, String gender, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
	}

	// Getters and Setters for All the Properties
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", gender=" + gender + ", address=" + address + "]";
	}

	

}
