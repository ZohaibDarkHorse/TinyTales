package com.tinyTales.project.TinyTalesProjectAPIs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turf {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long turfId;

	@Column
	String turfImages;

	@Column
	String turfAddress;

	@Column
	String location;
	
	@Column
	Long clientId;

	public Long getTurfId() {
		return turfId;
	}

	public void setTurfId(Long turfId) {
		this.turfId = turfId;
	}

	public String getTurfImages() {
		return turfImages;
	}

	public void setTurfImages(String turfImages) {
		this.turfImages = turfImages;
	}

	public String getTurfAddress() {
		return turfAddress;
	}

	public void setTurfAddress(String turfAddress) {
		this.turfAddress = turfAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "Turf [turfId=" + turfId + ", turfImages=" + turfImages + ", turfAddress=" + turfAddress + ", location="
				+ location + ", clientId=" + clientId + "]";
	}
	
	
	
}
