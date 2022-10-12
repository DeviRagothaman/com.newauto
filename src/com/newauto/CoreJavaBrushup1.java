package com.newauto;

import java.util.ArrayList;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// Do i need this..?
		
		int[] arr2= {1,2,3,4,5,6,7,9};
//check if value multiplies by 2
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i] + "is not multiplies by2");
			}
		
		
			// Demo commit
		}
		
ArrayList<String> gh=new ArrayList<String>();

gh.add("Devi");
gh.add("SenthilKumar");
gh.add("ThanuSree");
gh.add("nithin");
gh.add("Kashvi");
gh.remove(3);

System.out.println(gh.get(3));
	
	}

}
