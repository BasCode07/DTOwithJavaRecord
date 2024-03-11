package com.bascode;

import java.util.List;

public class Student {
	
	private int id;
	private String userName;
	private String FullName;
	private String scn;
	private double salary;
	private List<String> tech;
	private String position;
	
	
	public Student(int id, String userName, String fullName, String scn, double salary, List<String> tech,
			String position) {

		this.id = id;
		this.userName = userName;
		FullName = fullName;
		this.scn = scn;
		this.salary = salary;
		this.tech = tech;
		this.position = position;
	}
	public Student() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getScn() {
		return scn;
	}
	public void setScn(String scn) {
		this.scn = scn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getTech() {
		return tech;
	}
	public void setTech(List<String> tech) {
		this.tech = tech;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + ", FullName=" + FullName + ", scn=" + scn + ", salary="
				+ salary + ", tech=" + tech + ", position=" + position + "]";
	}
	
	
	
	

}
