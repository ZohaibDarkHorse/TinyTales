package com.tinyTales.project.TinyTalesProjectAPIs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinyTales.project.TinyTalesProjectAPIs.model.RegisterTinyTalesClient;
import com.tinyTales.project.TinyTalesProjectAPIs.service.TinyTalesClientService;

@RestController
public class TinyTalesClientController {

	@Autowired
	private TinyTalesClientService tinyTalesClientService;

	@PostMapping("/registerTinyTalesClient")
	public ResponseEntity<RegisterTinyTalesClient> registerTinyTalesClient(@RequestBody RegisterTinyTalesClient registerTinyTalesClient) {

		tinyTalesClientService.setRequestIn(registerTinyTalesClient);

		ResponseEntity<RegisterTinyTalesClient> isRequestValid = tinyTalesClientService.IsRequestValid();
		if (isRequestValid != null)
			return isRequestValid;

		ResponseEntity<RegisterTinyTalesClient> checkIfDataExist = tinyTalesClientService.checkIfDataExist();
		if (checkIfDataExist != null)
			return checkIfDataExist;

		return tinyTalesClientService.setRegisterTinyTalesClientResponse();

	}

}
