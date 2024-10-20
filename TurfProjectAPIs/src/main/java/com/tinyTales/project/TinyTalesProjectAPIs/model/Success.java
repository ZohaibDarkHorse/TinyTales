package com.tinyTales.project.TinyTalesProjectAPIs.model;

public class Success {

	private int status;
	
	private String message;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Success [status=" + status + ", message=" + message + "]";
	}
	
	
	
	
	
}
