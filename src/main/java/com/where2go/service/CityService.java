package com.where2go.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.where2go.domain.City;
import com.where2go.domain.Province;

@Transactional
@Service
public class CityService {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	ProvinceService provinceService;
	
	public void save(City city, Long provinceId){
		city.setProvince(provinceService.getProvince(provinceId));
		sessionFactory.getCurrentSession().saveOrUpdate(city);		
	}
	
	public List<City> getAllCities(){
		List<City> cities = (List<City>) sessionFactory.getCurrentSession().createQuery("FROM City").list();
		return cities;
	}
	
	public void deleteCity(Long id){	
		City city = sessionFactory.getCurrentSession().load(City.class, id);
		sessionFactory.getCurrentSession().delete(city);
	}
	
	public City getCity(Long id){
		City city = sessionFactory.getCurrentSession().load(City.class, id);
		city.toString();
		return city;
	}
}
