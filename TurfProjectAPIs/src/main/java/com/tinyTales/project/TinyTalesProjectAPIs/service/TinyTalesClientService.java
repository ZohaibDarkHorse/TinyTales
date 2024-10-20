package com.tinyTales.project.TinyTalesProjectAPIs.service;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tinyTales.project.TinyTalesProjectAPIs.model.Fault;
import com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClient;
import com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClientResponse;
import com.tinyTales.project.TinyTalesProjectAPIs.model.Success;
import com.tinyTales.project.TinyTalesProjectAPIs.repository.RegisterTinyTalesClientRepository;
import com.tinyTales.project.TinyTalesProjectAPIs.utils.Utils;

@Service
public class TinyTalesClientService {

	@Autowired
	Utils oUtils;

	@Autowired
	RegisterTinyTalesClientRepository registerTurfClientRepository;

	private RegisterTinyTalesClient oRegisterTurfClient;

	public RegisterTinyTalesClient getoRegisterTurfClient() {
		return oRegisterTurfClient;
	}

	public void setRequestIn(com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClient registerTurfClient) {
		oRegisterTurfClient = registerTurfClient;
	}

	public ResponseEntity<com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClient> IsRequestValid() {

		RegisterTinyTalesClientResponse oTurfClientResponse = new RegisterTinyTalesClientResponse();

		if (StringUtils.isBlank(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getClientName())
				|| StringUtils.isBlank(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getContactNumber())
				|| StringUtils.isBlank(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getEmail())
				|| StringUtils.isBlank(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getPassword())) {

			Fault oFault = oUtils.createBadRequestFault("Missing field value inside registerClientRequest", 401,
					"Bad request");

			oTurfClientResponse.setFault(oFault);
			oRegisterTurfClient.setRegisterTinyTalesClientResponse(oTurfClientResponse);
			oRegisterTurfClient.setRegisterTinyTalesClientRequest(null);

			return ResponseEntity.badRequest().body(oRegisterTurfClient);
		}

		return null;
	}

	public ResponseEntity<com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClient> checkIfDataExist() {

		RegisterTinyTalesClientResponse oTurfClientResponse = new RegisterTinyTalesClientResponse();
		// checking if record already exist inside DB
		List<com.tinyTales.project.TinyTalesProjectAPIs.entity.RegisterTinyTalesClient> recordExist = registerTurfClientRepository
				.findByEmail(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getEmail());

		if (!recordExist.isEmpty()) {
			Fault oFault = oUtils.createBadRequestFault("Email Already Exist:📧", 409, "Bad request");

			oTurfClientResponse.setFault(oFault);
			oRegisterTurfClient.setRegisterTinyTalesClientResponse(oTurfClientResponse);
			oRegisterTurfClient.setRegisterTinyTalesClientRequest(null);

			return ResponseEntity.badRequest().body(oRegisterTurfClient);
		}

		return null;

	}

	public ResponseEntity<com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClient> setRegisterTinyTalesClientResponse() {

		RegisterTinyTalesClientResponse oTurfClientResponse = new RegisterTinyTalesClientResponse();
		com.tinyTales.project.TinyTalesProjectAPIs.entity.RegisterTinyTalesClient oTurfClient = new com.tinyTales.project.TinyTalesProjectAPIs.entity.RegisterTinyTalesClient();

		oTurfClient.setClientName(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getClientName());
		oTurfClient.setContactNumber(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getContactNumber());
		oTurfClient.setEmail(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getEmail());
		oTurfClient.setPassword(oRegisterTurfClient.getRegisterTinyTalesClientRequest().getPassword());

		registerTurfClientRepository.save(oTurfClient);

		Success oSuccess = new Success();
		oSuccess.setMessage("Registered Sucessfully:😀");
		oSuccess.setStatus(200);
		oTurfClientResponse.setSuccess(oSuccess);
		oRegisterTurfClient.setRegisterTinyTalesClientResponse(oTurfClientResponse);
		oRegisterTurfClient.setRegisterTinyTalesClientRequest(null);

		return ResponseEntity.created(null).body(oRegisterTurfClient);

	}

}
