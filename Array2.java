package com.ashokIt;

import java.util.HashSet;
import java.util.Set;

//	2)Write a Java Program to remove duplicate elements in given Array?
//		Input:  1, 2, 5, 5, 6, 6, 7, 2
//		Output:  1, 2, 5, 6, 7

public class Array2 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,5,6,6,7,2};
		
		Set<Integer> hs = new HashSet();
		
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}

		for(int x : hs)
		{
			System.out.print(x+" ");
		}		
	}
}
