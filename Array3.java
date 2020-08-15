package com.ashokIt;

import java.util.HashSet;
import java.util.Set;

//		3)Write a Java Program to find sum of unique elements in given Array?
//		
//		Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
//		Output : 24 
//		(Unique elements are: 1, 6, 4, 3, 2, 8)
//		
//		Input= {1, 1, 3, 2, 2, 3};
//		Output : 6 
//		(Unique elements are: 1, 2, 3)

public class Array3 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,6,4,3,2,2,3,8,1};	int sum=0;

		Set<Integer> hs = new HashSet();
		
		
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		for(int x : hs)
		{
			sum = sum + x;
		}	
		System.out.println("Sum is : "+sum);
		
	}

}
