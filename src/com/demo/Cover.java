package com.demo;

public class Cover {
	private int sid;
	private String sname;
	private String stype;
	private double samt;
	
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public double getSamt() {
		return samt;
	}
	public void setSamt(double samt) {
		this.samt = samt;
	}
	@Override
	public String toString() {
		return "Cover [sid=" + sid + ", sname=" + sname + ", stype=" + stype + ", samt=" + samt + "]";
	}
	
	
}
