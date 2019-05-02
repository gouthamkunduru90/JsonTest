package com.goutham.json.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goutham.json.example.model.JsonRequest;
import com.goutham.json.example.model.ResponseData;
import com.goutham.json.example.service.JsonDemoService;

@RestController
public class JsonDemoController {
	@Autowired
	JsonDemoService jsonDemoService;

	@PostMapping("/response1")
	public ResponseEntity<List<ResponseData>> getJsonResponse(@RequestBody JsonRequest jsonRequest) {
		List<ResponseData> responseData = jsonDemoService.convertPayloads(jsonRequest);
		return new ResponseEntity<List<ResponseData>>(responseData, HttpStatus.OK);

	}

}
