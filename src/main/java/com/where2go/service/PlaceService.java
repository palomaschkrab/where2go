package com.where2go.service;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.where2go.domain.Address;
import com.where2go.domain.City;
import com.where2go.domain.Place;

@Transactional
@Service
public class PlaceService {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private AddressService addressService;
	
	public void save(Place place, Address address){
		sessionFactory.getCurrentSession().saveOrUpdate(place);	
		addressService.save(address);
		place.setAddress(address);
	}
	
}
