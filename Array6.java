package com.ashokIt;

//		6)Write a Java Program to find Min and Max elements in given Array?
//		Input:  1, 2, 5, 5, 6, 6, 7, 2
//		Output:   Min : 1  Max : 7


public class Array6 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,5,5,6,6,7,2};
		
		int min=arr[0],max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			
			if(max<arr[i])
				max=arr[i];
		}
		
		System.out.println("Minimum Number : "+min);
		System.out.println("Maximum Number : "+max);
	}
}
