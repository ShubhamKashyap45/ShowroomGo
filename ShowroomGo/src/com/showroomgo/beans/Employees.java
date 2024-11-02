package com.showroomgo.beans;

public class Employees {
	private int emp_id;
	private String emp_name;
	private int emp_age;
	private String emp_dep;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int emp_id, String emp_name, int emp_age, String emp_dep) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_dep = emp_dep;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_dep() {
		return emp_dep;
	}

	public void setEmp_dep(String emp_dep) {
		this.emp_dep = emp_dep;
	}

	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", emp_dep="
				+ emp_dep + "]";
	}
	
	

}
