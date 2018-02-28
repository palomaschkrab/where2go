package com.where2go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.where2go.domain.City;
import com.where2go.domain.Province;
import com.where2go.service.CityService;
import com.where2go.service.ProvinceService;

@Controller
public class CityController {
	
	@Autowired
	CityService cityService;
	@Autowired
	ProvinceService provinceService;
	
	@GetMapping("/cities")
	public String index(Model model){
		//Add the list of provinces to model, that will be used on the jsp file
		model.addAttribute("cityList", cityService.getAllCities());
		return "cities/index";
	}
	
	@GetMapping("createCity")
	public String create(Model model){
		model.addAttribute("provinceList", provinceService.getAllProvinces());	
		return "cities/createCity";
	}
	
	@PostMapping("saveCity")
	public String save(City city, @RequestParam Long provinceId, Model model){
		System.out.println(city);
		System.out.println("ProvinceId: " + provinceId);
		cityService.save(city, provinceId);		
		//Add the list of provinces to model, that will be used on the jsp file
		model.addAttribute("cityList", cityService.getAllCities());		
		return "cities/index";		
	}
	@PostMapping("deleteCity")
	public String delete(@RequestParam Long id, Model model){
		cityService.deleteCity(id);
		//Add the list of provinces to model, that will be used on the jsp file
		model.addAttribute("cityList", cityService.getAllCities());		
		return "cities/index";
	}
	@GetMapping("editCity")
	public String edit(@RequestParam Long id, Model model){
		City city = cityService.getCity(id);
		model.addAttribute("city", city);
		model.addAttribute("provinceList", provinceService.getAllProvinces());	
		return "cities/createCity";
	}
}
