package com.tinyTales.project.TinyTalesProjectAPIs.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterTinyTalesClientResponse {

	private Success success;

	private Fault fault;

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	public Fault getFault() {
		return fault;
	}

	public void setFault(Fault fault) {
		this.fault = fault;
	}

	@Override
	public String toString() {
		return "RegisterTurfClientResponse [success=" + success + ", fault=" + fault + "]";
	}
	
	
	

}
