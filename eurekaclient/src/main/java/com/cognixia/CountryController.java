package com.cognixia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.CountryWeb;


@RestController
public class CountryController {

	@Value("${server.port}")
	private int port;

	private static List<CountryWeb> countriesList = new ArrayList<CountryWeb>();
	
	static {
	CountryWeb egypt = new CountryWeb();
	egypt.setName("Egypt");
	
	CountryWeb guam = new CountryWeb();
	guam.setName("Guam");
	
	CountryWeb morocco = new CountryWeb();
	morocco.setName("Morocco");
	
	CountryWeb philippines = new CountryWeb();
	philippines.setName("Philippines");
	
	CountryWeb sweden = new CountryWeb();
	sweden.setName("Sweden");
	
	countriesList.addAll(Arrays.asList(egypt, guam, morocco, philippines, sweden));
	}
	
	@GetMapping("/countries")
	public List<CountryWeb> welcome() {
		return countriesList;
		
	}
}
