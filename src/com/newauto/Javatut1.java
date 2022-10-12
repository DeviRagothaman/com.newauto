package com.newauto;

public class Javatut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String fname="Devi";

//System.out.println(fname);
		
		boolean mybool=true;
		
	//	int i=0;
		System.out.println(mybool);

		int day= 4;
	
		
		//Arrays	
		
		
		int[] arr2= {1,2,3,4,5,6,7,9};
		
		
		for(int i=1;i<arr2.length;i++)
		
		{
			
			System.out.println(arr2[i]);
		}

	String[] name= {"Devi","Senthil","Nithin"};
		for(int i=0;i<name.length;i++)
			
		{
			System.out.println(name[i]);
		}
		
		for(String s:name) {
			
			
			System.out.println(s);
		}
		
		
		switch(day)
{
case 1:
	System.out.println("Monday");
	
case 2:
	System.out.println("Tuesday");
	
case 3:
	System.out.println("Wednesday");
	
case 4:
	System.out.println("Thursday");
	break;

case 5:
System.out.println("Friday");

}
		
	}

}
