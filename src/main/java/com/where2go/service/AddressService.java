package com.where2go.service;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.where2go.domain.Address;

@Transactional
@Service
public class AddressService {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Address address){
		sessionFactory.getCurrentSession().saveOrUpdate(address);
	}
}
