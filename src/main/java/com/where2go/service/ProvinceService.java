package com.where2go.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.where2go.domain.Province;

@Transactional 
@Service
public class ProvinceService {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Province province){
		sessionFactory.getCurrentSession().saveOrUpdate(province);		
	}

	public List<Province> getAllProvinces(){
		List<Province> provinces = (List<Province>) sessionFactory.getCurrentSession().createQuery("FROM Province").list();
		return provinces;
	}
	
	public void deleteProvince(Long id){	
		Province province = sessionFactory.getCurrentSession().load(Province.class, id);
		sessionFactory.getCurrentSession().delete(province);
	}
	
	public Province getProvince(Long id){
		Province province = sessionFactory.getCurrentSession().load(Province.class, id);
		province.toString();
		return province;
	}
	
}
