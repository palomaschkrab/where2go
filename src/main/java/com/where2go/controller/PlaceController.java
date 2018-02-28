package com.where2go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.where2go.domain.Address;
import com.where2go.domain.Place;
import com.where2go.service.CityService;
import com.where2go.service.PlaceService;

@Controller
public class PlaceController {
	
	@Autowired
	PlaceService placeService;
	@Autowired
	CityService cityService;	
	
	@GetMapping("/places")
	public String index(Model model){
		//Add the list of provinces to model, that will be used on the jsp file
		//model.addAttribute("placeList", placeService.getAllPlaces());
		return "places/index";
	}
	
	@GetMapping("createPlace")
	public String create(){
		return "places/createPlace";
	}
	
	@PostMapping("savePlace")
	public String save(Place place, Address address){
		System.out.println("Place:" + place);
		System.out.println("Place.getAddress():" + place.getAddress());
		System.out.println("Address: " + address);
		placeService.save(place, address);
		return "places/index";
	}
}
