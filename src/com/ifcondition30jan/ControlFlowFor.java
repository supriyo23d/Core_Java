package com.ifcondition30jan;

public class ControlFlowFor 
{
	public static void main(String[] args) 
	{
		String words[]= {"My","name","is","Supriyo","Dhali"};
		//at the end use } instead of )
		
		for(int index=2;index<= words.length;index++)
//			instead index=2 use int index=2,words.length()--->remove()
		{
			String word= words[index];
			//words= words[index];-->word= words[index];
			System.out.println(word);
			System.out.println(word.toLowerCase());

		}
		
		
	}

}
