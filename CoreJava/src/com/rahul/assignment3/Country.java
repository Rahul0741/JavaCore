package com.rahul.assignment3;

public class Country extends Continent{
	private String coname;
	private String hills;
	private String river;
	
	public Country(String cname, String mountains, String oceans, String coname, String hills, String river) {
		super(cname, mountains, oceans);
		this.coname = coname;
		this.hills = hills;
		this.river = river;
	}

	public String getConame() {
		return coname;
	}

	public void setConame(String coname) {
		this.coname = coname;
	}

	public String getHills() {
		return hills;
	}

	public void setHills(String hills) {
		this.hills = hills;
	}

	public String getRiver() {
		return river;
	}

	public void setRiver(String river) {
		this.river = river;
	}
	
	
	
}
