package com.tinyTales.project.TinyTalesProjectAPIs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegisterTinyTalesClient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // This will make it get added on its Own by increment of +1
	private Long clientId;

	@Column
	private String clientName;

	@Column
	 private String email;

	@Column
	private String contactNumber;
	
	@Column
	private String password;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

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


	
	

	


}
