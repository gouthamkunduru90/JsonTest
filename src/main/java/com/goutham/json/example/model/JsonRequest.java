package com.goutham.json.example.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonRequest {
	private Map<String, Value> data;
	@JsonProperty("timestamp")
	private Number timeStamp;

	public Map<String, Value> getData() {
		return data;
	}

	public void setData(Map<String, Value> data) {
		this.data = data;
	}

	public Number getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Number timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Data1 [data=" + data + "]";
	}

}
