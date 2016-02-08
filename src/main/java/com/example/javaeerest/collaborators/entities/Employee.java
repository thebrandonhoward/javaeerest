package com.example.javaeerest.collaborators.entities;

import com.example.javaeerest.collaborators.boundaries.Person;

public class Employee
	implements Person
{
	public String user = "default user";
	public String organization = "default org";
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "{user= \"" + user + "\", organization= \"" + organization + "\"}";
	}		
}
