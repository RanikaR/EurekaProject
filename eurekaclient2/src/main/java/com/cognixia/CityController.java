package com.cognixia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.CityWeb;


@RestController
public class CityController {

	@Value("${server.port}")
	private int port;

	private static List<CityWeb> citiesList = new ArrayList<CityWeb>();
	
	static {
	CityWeb egypt = new CityWeb();
	egypt.setName("Cairo");
	
	CityWeb guam = new CityWeb();
	guam.setName("Hagatna");
	
	CityWeb morocco = new CityWeb();
	morocco.setName("Rabat");
	
	CityWeb philippines = new CityWeb();
	philippines.setName("Manila");
	
	CityWeb sweden = new CityWeb();
	sweden.setName("Stockholm");
	
	citiesList.addAll(Arrays.asList(egypt, guam, morocco, philippines, sweden));
	}
	
	@GetMapping("/cities")
	public List<CityWeb> cities() {
		return citiesList;
		
	}
}
