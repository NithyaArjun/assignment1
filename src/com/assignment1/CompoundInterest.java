package com.assignment1;

public class CompoundInterest {
	
	
	void interestCalculator(double initialamount , double interestrate) {
		
		for(int year=1; year<=30; year++) {
			
			initialamount = initialamount + (initialamount*interestrate);
			
			if(year % 5 ==0) {
				
				System.out.println("After "+year +" you would have "+initialamount);
			}
		}
	
		
		
	}

}
