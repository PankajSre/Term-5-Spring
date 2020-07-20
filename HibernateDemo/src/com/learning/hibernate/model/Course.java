package com.learning.hibernate.model;

public class Course {

	private int id;
	private String courseName;
	private double duration;
	private double price;
	private String faculty;
	private String qualification;

	public Course() {
	}

	public Course(int id, String courseName, double duration, double price, String faculty, String qualification) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
		this.price = price;
		this.faculty = faculty;
		this.qualification = qualification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", price=" + price
				+ ", faculty=" + faculty + ", qualification=" + qualification + "]";
	}

}
