package com.rahul.assignment3;

public class Continent {
	private String cname;
	private String mountains;
	private String oceans;

	public Continent(String cname, String mountains, String oceans) {
		super();
		this.cname = cname;
		this.mountains = mountains;
		this.oceans = oceans;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMountains() {
		return mountains;
	}

	public void setMountains(String mountains) {
		this.mountains = mountains;
	}

	public String getOceans() {
		return oceans;
	}

	public void setOceans(String oceans) {
		this.oceans = oceans;
	}
	

}
