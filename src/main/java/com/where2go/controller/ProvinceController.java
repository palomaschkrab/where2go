package com.where2go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.where2go.domain.Province;
import com.where2go.service.ProvinceService;

@Controller
public class ProvinceController {

	@Autowired
	ProvinceService provinceService;
	
	
	@GetMapping("/provinces")
	public String index(Model model){
		//Add the list of provinces to model, that will be used on the jsp file
		model.addAttribute("provinceList", provinceService.getAllProvinces());
		return "provinces/index";
	}
	
	@GetMapping("createProvince")
	public String create(){
		return "provinces/createProvince";
	}
	
	@PostMapping("saveProvince")
	public String save(Province province, Model model){
		System.out.println(province);
		provinceService.save(province);		
		//Add the list of provinces to model, that will be used on the jsp file
		model.addAttribute("provinceList", provinceService.getAllProvinces());		
		return "provinces/index";		
	}
	
	@PostMapping("deleteProvince")
	public String delete(@RequestParam Long id, Model model){
		provinceService.deleteProvince(id);
		//Add the list of provinces to model, that will be used on the jsp file
		model.addAttribute("provinceList", provinceService.getAllProvinces());		
		return "provinces/index";
	}
	
	@GetMapping("editProvince")
	public String edit(@RequestParam Long id, Model model){
		Province province = provinceService.getProvince(id);
		model.addAttribute("province", province);
		return "provinces/createProvince";
	}
}
