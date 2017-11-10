package com.viktoria.statska;

public class Student {
	
	private String surname;
	private Integer age;
	private Integer course;
	
	public Student(String surname, Integer age, Integer course) {
		super();
		this.surname = surname;
		this.age = age;
		this.course = course;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getCourse() {
		return course;
	}
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	
}
