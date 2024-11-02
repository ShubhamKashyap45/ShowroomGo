package com.showroomgo.test;

import java.util.Scanner;

import com.showroomgo.service.ShowroomServiceImpl;
import com.showroomgo.service.ShowroomSrevice;

public class TestShowroom {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ShowroomSrevice sservice = new ShowroomServiceImpl();
		
		System.out.println("======================= *** WELCOME TO SHOWROOMGO MANAGEMENT SYSTEM *** =======================");
		System.out.println();
		
		int choice=100;
		do {
			
			System.out.println();
	        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
	        System.out.println();
	        System.out.println("1.ADD SHOWROOMS \t\t\t 2.ADD EMPLOYEES \t\t\t 3.ADD CARS");
	        System.out.println();
	        System.out.println("4.GET SHOWROOMS \t\t\t 5.GET EMPLOYEES \t\t\t 6.GET CARS");
	        System.out.println();
	        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
	        System.out.println();
	        
	        choice=scn.nextInt();
	        
	        switch(choice) {
	        case 1->{
	        	boolean status = sservice.addNewShowroom();
	        	if(status) {
		        	System.out.println();
		        	System.out.println("SHOWROOM ADDED SUCCESSFULLY");
	        	} else {
	        		System.out.println("ERROR IN ADDING SHOWROOM");
	        	}
	        }
	        
	        case 2->{
	        	sservice.addEmployee();
	        	System.out.println();
	        	System.out.println("EMPLOYEE ADDED SUCCESSFULLY");
	        }
	        case 3 -> {
	        	sservice.addCars();
	        	System.out.println();
	        	System.out.println("CAR SUCCESSFULLY ADDED");
	        } 
	        case 4 -> {
	        	sservice.getshowrooms();
	        	System.out.println();
	        } 
	        case 5 -> {
	        	sservice.getEmployees();
	        	System.out.println();
	        }
	        case 6 -> {
	        	sservice.getCars();
	        	System.out.println();
	        }
	        
	        case 0 -> {
	    		System.out.println("\t\t\t THANK YOU FOR VISITING......");
	    		scn.close();
	        }
	        default -> {
	        	System.out.println("Enter Valid Choice");
	        	break;
	        }
	        }
		} while(choice != 0);
		
		
	}

}
