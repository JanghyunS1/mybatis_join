package com.mybatis.join.vo;

import org.springframework.stereotype.Component;

@Component
public class LocationsVO {

	private int location_ID;
	private String street_Address;
	private String postal_Code;
	private String city;
	private String state_Province;
	private String country_ID;
	
	public LocationsVO () {}

	public int getLocation_ID() {
		return location_ID;
	}

	public void setLocation_ID(int location_ID) {
		this.location_ID = location_ID;
	}

	public String getStreet_Address() {
		return street_Address;
	}

	public void setStreet_Address(String street_Address) {
		this.street_Address = street_Address;
	}

	public String getPostal_Code() {
		return postal_Code;
	}

	public void setPostal_Code(String postal_Code) {
		this.postal_Code = postal_Code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_Province() {
		return state_Province;
	}

	public void setState_Province(String state_Province) {
		this.state_Province = state_Province;
	}

	public String getCountry_ID() {
		return country_ID;
	}

	public void setCountry_ID(String country_ID) {
		this.country_ID = country_ID;
	}

	@Override
	public String toString() {
		return "LocationsVO [location_ID=" + location_ID + ", street_Address=" + street_Address + ", postal_Code="
				+ postal_Code + ", city=" + city + ", state_Province=" + state_Province + ", country_ID=" + country_ID
				+ "]";
	}
	
	
	
}
