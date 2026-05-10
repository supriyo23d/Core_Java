package com.ifcondition30jan;

import java.util.Scanner;

public class While
{
	public static void main(String[] args)
	{
		int luckyNumber=1;
		int enteredNumber=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		while( enteredNumber!=luckyNumber)
		{
			enteredNumber=sc.nextInt();
			if(enteredNumber !=luckyNumber)
			{
				System.out.println("Try again !");
			}	
		}
		System.out.println("You won!!");
		sc.close();
	}
}
