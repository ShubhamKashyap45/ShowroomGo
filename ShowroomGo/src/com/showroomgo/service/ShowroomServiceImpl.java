package com.showroomgo.service;

import java.util.Scanner;

import com.showroomgo.beans.Cars;
import com.showroomgo.beans.Employees;
import com.showroomgo.beans.Showroom;

public class ShowroomServiceImpl implements ShowroomSrevice {
	private static Showroom[] showarr;
	public static int scnt=0;
	static {
		showarr = new Showroom[10];
	}
	
	public static Employees[] emparr;
	public static int ecnt=0;
	static {
		emparr = new Employees[10];
	}
	
	private static Cars[] cararr;
	public static int ccnt=0;
	static {
		cararr = new Cars[10];
	}

	@Override
	public boolean addNewShowroom() {
		Scanner scn = new Scanner(System.in);
		System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        
        System.out.print("ENTER SHOWROOM NAME: ");
        String showroom_name = scn.nextLine();
        
        System.out.print(("ENTER SHOWROOM ADDRESS: "));
        String showroom_address = scn.nextLine();
        
        System.out.print("ENTER TOTAL NO OF EMPLOYEES: ");
        int total_employees = scn.nextInt();
        
        System.out.print("ENTER TOTAL CARS IN STOCK: ");
        int total_cars_in_stock = scn.nextInt();
        
        // Consuming the leftover newline character
        scn.nextLine(); 

        System.out.print("ENTER MANAGER NAME: ");
        String manager_name = scn.nextLine();


		showarr[scnt] = new Showroom(showroom_name,showroom_address, total_employees, total_cars_in_stock, manager_name);
		scnt++;
		
		
		return true;
		
	}

	@Override
	public void addEmployee() {
		Scanner scn = new Scanner(System.in);
		System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
		System.out.println();
		
		System.out.println("ENTER EMPLOYEE ID: ");
		int eid = scn.nextInt();
		scn.nextLine();
		
		System.out.println("ENTER EMPLOYEE NAME: ");
		String ename = scn.nextLine();
		
		System.out.println("ENTER EMPLOYEE AGE: ");
		int eage = scn.nextInt();
		scn.nextLine();
		
		System.out.print("ENTER EMPLOYEE DEPARTMENT: ");
		String edep = scn.nextLine();
		
		
		emparr[ecnt] = new Employees(eid, ename, eage, edep);
		ecnt++;
		
	}
	
	
	@Override
	public void addCars() {
		Scanner scn = new Scanner(System.in);
		System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
		System.out.println();
		
		System.out.println("ENTER CAR NAME: ");
		String carname = scn.nextLine();
		
		System.out.println("ENTER CAR COLOR: ");
		String carcolor = scn.nextLine();
		
		System.out.println("ENTER CAR FUEL TYPE: ");
		String carfueltype = scn.nextLine();
		
		System.out.println("ENTER CAR PRICE: ");
		int carprice = scn.nextInt();
		scn.nextLine();
		
		System.out.println("ENTER CAR TYPE");
		String cartype = scn.nextLine();
		
		System.out.println("ENTER TRANSMISSION TYPE: ");
		String cartransmission = scn.nextLine();
		
		cararr[ccnt] = new Cars(carname, carcolor, carfueltype, carprice, cartype, cartransmission);
		ccnt++;
	}

	@Override
	public void getshowrooms() {
		// TODO Auto-generated method stub
		for(int i=0; i<scnt; i++) {
			System.out.println(showarr[i].toString());
			System.out.println();
		}
		
		System.out.println();
	}

	@Override
	public void getEmployees() {
		// TODO Auto-generated method stub
		for(int i=0; i<ecnt; i++) {
			System.out.println("Employee ID: " + emparr[i].getEmp_id());
			System.out.println("Employee Name: " + emparr[i].getEmp_name());
			System.out.println("Employee Age: " + emparr[i].getEmp_age());
			System.out.println("Employee Department: "+ emparr[i].getEmp_dep());
			System.out.println();
		}
		
	}

	@Override
	public void getCars() {
		for(int i=0; i<ccnt; i++) {
			System.out.println("Car Name: " + cararr[i].getCname());
			System.out.println("Car Color: " + cararr[i].getCcolor());
			System.out.println("Car Fuel Type: " + cararr[i].getCfueltype());
			System.out.println("Car Price: " + cararr[i].getCprice());
			System.out.println("Car Type: " + cararr[i].getCtype());
			System.out.println("Car Transmission Type: " + cararr[i].getCtransmission());
			System.out.println();
		}
		
		
	}


	


}
