package com.tinyTales.project.TinyTalesProjectAPIs.model;

public class RegisterTinyTalesClientRequest {

	private String clientName;

	private String email;

	private String contactNumber;

	private String password;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegisterTurfClientRequest [clientName=" + clientName + ", email=" + email + ", contactNumber="
				+ contactNumber + ", password=" + password + "]";
	}

}
