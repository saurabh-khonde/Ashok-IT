package com.ashokIt;

//		5)Write a java program to find maximum difference between two elements in given Array?
//			Input = { 2, 5, 1, 7, 3, 9, 5}
//			Output = 8  
//		
//		Explanation : The maximum difference is between 1 and 9
//			Input = { 9, 2, 12, 5, 4, 7, 3, 19, 5}
//			Output: 17

public class Array5 {

	public static void main(String[] args) {
		
//		int arr[] = { 2, 5, 1, 7, 3, 9, 5};
		
		int arr[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
		
		int min = arr[0], max=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		
		System.out.println("Difference Between Max & Min : "+(max-min));
	}
}
