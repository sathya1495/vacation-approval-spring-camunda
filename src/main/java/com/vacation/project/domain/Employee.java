package com.vacation.project.domain;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;

public	Employee(int id, String firstName, String lastname) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastname;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
}
