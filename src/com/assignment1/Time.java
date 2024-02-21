package com.assignment1;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 System.out.println("This is a Compound Interest Calculator");

	 System.out.println("Enter Initial Investment Amount");
	 
	 Scanner scan = new Scanner(System.in);
	 
	 double initialamount = scan.nextDouble();
	 
	 System.out.println("Enter Your Interest Rate"); 
	  
	 double interestrate = scan.nextDouble();
	 
	 if(initialamount > 0.00 && initialamount <100000.0) {
		 
	 
		 if(  interestrate> 0.0 &&  interestrate <0.1) {
			 
		 
	 CompoundInterest amount =  new  CompoundInterest();
	 
	 amount.interestCalculator(initialamount, interestrate);
	 }
		 

	 else {
		 
	 System.out.println("Interest  rate is too low");
	 
	 }
		 
	 }
	 else {
		 
		 System.out.println("Initial amount  is too low");
	 }
	 
	 scan.close();
	
	}

}
