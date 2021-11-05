package edu.vinaenter.models;

public class Country {

	String countryName;

	public Country(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

}