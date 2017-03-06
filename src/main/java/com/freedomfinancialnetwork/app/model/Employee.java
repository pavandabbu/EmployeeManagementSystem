package com.freedomfinancialnetwork.app.model;

public class Employee{
	
	private int id;
	private String name;
	private String Gender;
	private int Dept_id;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public int getDept_id() {
		return Dept_id;
	}


	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Gender=" + Gender + ", Dept_id=" + Dept_id + "]";
	}
	
	

}
