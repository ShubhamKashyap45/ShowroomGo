package com.showroomgo.beans;

public class Cars {
	private String cname;
	private String ccolor;
	private String cfueltype;
	private int cprice;
	private String ctype;
	private String ctransmission;
	
	
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cars(String cname, String ccolor, String cfueltype, int cprice, String ctype, String ctransmission) {
		super();
		this.cname = cname;
		this.ccolor = ccolor;
		this.cfueltype = cfueltype;
		this.cprice = cprice;
		this.ctype = ctype;
		this.ctransmission = ctransmission;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCcolor() {
		return ccolor;
	}


	public void setCcolor(String ccolor) {
		this.ccolor = ccolor;
	}


	public String getCfueltype() {
		return cfueltype;
	}


	public void setCfueltype(String cfueltype) {
		this.cfueltype = cfueltype;
	}


	public int getCprice() {
		return cprice;
	}


	public void setCprice(int cprice) {
		this.cprice = cprice;
	}


	public String getCtype() {
		return ctype;
	}


	public void setCtype(String ctype) {
		this.ctype = ctype;
	}


	public String getCtransmission() {
		return ctransmission;
	}


	public void setCtransmission(String ctransmission) {
		this.ctransmission = ctransmission;
	}


	@Override
	public String toString() {
		return "Cars [cname=" + cname + ", ccolor=" + ccolor + ", cfueltype=" + cfueltype + ", cprice=" + cprice
				+ ", ctype=" + ctype + ", ctransmission=" + ctransmission + "]";
	}
	
	
}
