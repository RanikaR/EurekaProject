package com.cognixia;

import org.springframework.stereotype.Component;

@Component 
public class CityWeb {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
