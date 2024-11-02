package com.showroomgo.beans;

public class Showroom {
	private String showr_name;
	private String showr_addr;
	private int showr_total_emp;
	private int showr_cars_in_stock;
	private String showr_manager;
	
	public Showroom() {
		super();
	}
	
	public Showroom(String showr_name, String showr_addr, int showr_total_emp, int showr_cars_in_stock,
			String showr_manager) {
		super();
		this.showr_name = showr_name;
		this.showr_addr = showr_addr;
		this.showr_total_emp = showr_total_emp;
		this.showr_cars_in_stock = showr_cars_in_stock;
		this.showr_manager = showr_manager;
	}

	public String getShowr_name() {
		return showr_name;
	}

	public void setShowr_name(String showr_name) {
		this.showr_name = showr_name;
	}

	public String getShowr_addr() {
		return showr_addr;
	}

	public void setShowr_addr(String showr_addr) {
		this.showr_addr = showr_addr;
	}

	public int getShowr_total_emp() {
		return showr_total_emp;
	}

	public void setShowr_total_emp(int showr_total_emp) {
		this.showr_total_emp = showr_total_emp;
	}

	public int getShowr_cars_in_stock() {
		return showr_cars_in_stock;
	}

	public void setShowr_cars_in_stock(int showr_cars_in_stock) {
		this.showr_cars_in_stock = showr_cars_in_stock;
	}

	public String getShowr_manager() {
		return showr_manager;
	}

	public void setShowr_manager(String showr_manager) {
		this.showr_manager = showr_manager;
	}

	@Override
	public String toString() {
		return 
				("Showroom Name: " + showr_name + "\n" +
				"Show Room Address: " + showr_addr + "\n" +
				"Total Number of Employees: " + showr_total_emp + "\n" +
				"Total Number of Cars in Stock: " + showr_cars_in_stock + "\n" +
				"Manager Name: " + showr_manager);
	}
	
	
	
	
	
	


}
