package com.tinyTales.project.TinyTalesProjectAPIs.model;

public class Fault {

	private String type;
	
	private String description;
	
	private int number;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Fault [type=" + type + ", description=" + description + ", number=" + number + "]";
	}
	
	
	
	
	
}
