package com.switch1feb;

public class Discount2 {
	public static void main(String[] args) 
	{
	    String customerType="Gold";
		switch(customerType)
		{
		case"Gold":
			System.out.println("for gold customer 10% discount");			
			break;

		case"Silver":
			System.out.println("for silver customer 5% discount");			
			break;
		case"Platinum":
			System.out.println("for platinum customer 15% discount");			
			break;
		case"others":
			System.out.println("no discount");			
			break;
		default:
			break;
		}
	}	
}
