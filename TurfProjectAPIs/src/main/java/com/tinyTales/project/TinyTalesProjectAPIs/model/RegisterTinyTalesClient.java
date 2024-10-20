package com.tinyTales.project.TinyTalesProjectAPIs.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterTinyTalesClient {
	
	@JsonProperty("RegisterTinyTalesClientRequest")
	private RegisterTinyTalesClientRequest registerTinyTalesClientRequest;

	@JsonProperty("RegisterTinyTalesClientResponse")
	private RegisterTinyTalesClientResponse registerTinyTalesClientResponse;

	public RegisterTinyTalesClientRequest getRegisterTinyTalesClientRequest() {
		return registerTinyTalesClientRequest;
	}

	public void setRegisterTinyTalesClientRequest(RegisterTinyTalesClientRequest registerTinyTalesRequest) {
		this.registerTinyTalesClientRequest = registerTinyTalesRequest;
	}

	public RegisterTinyTalesClientResponse getRegisterTinyTalesClientResponse() {
		return registerTinyTalesClientResponse;
	}

	public void setRegisterTinyTalesClientResponse(RegisterTinyTalesClientResponse registerTinyTalesClientResponse) {
		this.registerTinyTalesClientResponse = registerTinyTalesClientResponse;
	}

	@Override
	public String toString() {
		return "RegisterTinyTalesClient [registerTinyTalesRequest=" + registerTinyTalesClientRequest
				+ ", registerTinyTalesClientResponse=" + registerTinyTalesClientResponse + "]";
	}
	
	
	
	
}
