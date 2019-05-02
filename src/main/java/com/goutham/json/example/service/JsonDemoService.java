package com.goutham.json.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.goutham.json.example.model.JsonRequest;
import com.goutham.json.example.model.ResponseData;

@Service
public class JsonDemoService {

	public List<ResponseData> convertPayloads(JsonRequest jsonRequest) {
		List<ResponseData> responseData = new ArrayList<>();
		jsonRequest.getData().forEach((element, value) -> {
			ResponseData response = new ResponseData();
			response.setGuid(element);
			response.setTimestamp(jsonRequest.getTimeStamp());
			response.setValue(value.getVal());
			responseData.add(response);
		});
		return responseData;
	}

}
