package com.ifcondition30jan;

public class ControlFlow 
{
	public static void main(String[] args)
	{
		int age = 25;
		if (age>21 && age<29 )
		{
			System.out.println("Can apply.");
			
		}else if(age>=29 && age <35)
		{
			System.out.println("Need reservation certificaton.");
		}else
		{
			System.out.println("Age limit exceed.");
		}
		
	}

}
