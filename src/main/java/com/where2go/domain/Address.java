package com.where2go.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String postalCode;
	private int streetNumber;
	private String street;
	private String suite;
	@ManyToOne
	private City city;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSuit() {
		return suite;
	}
	public void setSuit(String suit) {
		this.suite = suit;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [postalCode=" + postalCode + ", streetNumber=" + streetNumber + ", street=" + street + ", suite="
				+ suite + ", city=" + city + "]";
	}
	
	
}
