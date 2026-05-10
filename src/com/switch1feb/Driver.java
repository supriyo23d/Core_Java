package com.switch1feb;

public class Driver {
	public static void main(String[] args) {
		Driver driver =new Driver();
	    String customerType="Gold";
		switch(customerType)
		{
		case"Gold":
			driver.sendRewards(customerType);
			break;

		case"Silver":
			driver.sendRewards(customerType);
			break;
			
		default:
			break;
			
		//driver.sendRewards(customerType); and typ are different -- how

		
		}
	}
	//this below should be outside of main method
		public void sendRewards(String typ)//type small t 
		{
			System.out.println("Sending rewards to" +typ+ "customer");//type small t as above inside method
		}
	

}
