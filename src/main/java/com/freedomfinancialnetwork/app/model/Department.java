package com.freedomfinancialnetwork.app.model;

public class Department {

	private int Id;
	private String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + Name +"]";
	}
	
	
}
