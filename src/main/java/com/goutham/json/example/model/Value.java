package com.goutham.json.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
	@JsonProperty("val")
	private Number val;

	public Number getVal() {
		return val;
	}

	public void setVal(Number val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Value [val=" + val + "]";
	}
	
}
