package com.rahul.assignment3;

public class State extends Country{
	private String sname;
	private String lang;
	public State(String cname, String mountains, String oceans, String coname, String hills, String river, String sname,
			String lang) {
		super(cname, mountains, oceans, coname, hills, river);
		this.sname = sname;
		this.lang = lang;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "State [sname=" + sname + ", lang=" + lang + ", getConame()=" + getConame() + ", getHills()="
				+ getHills() + ", getRiver()=" + getRiver() + ", getCname()=" + getCname() + ", getMountains()="
				+ getMountains() + ", getOceans()=" + getOceans() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
