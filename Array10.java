package com.ashokIt;

//		10)Write a Java Program to find smallest pair sum in given Array?
//		Input: arr[] = {1, 7, 2, 9, 6}
//		Output: 3
//			The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3

public class Array10 {

	public static void main(String[] args) {
		
		int arr[] = {1,7,2,9,6};	int firstMin=arr[0], secMin=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(firstMin>arr[i])
				firstMin=arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(secMin>firstMin && secMin>arr[i])
			{
				if(arr[i]!=firstMin)
					secMin=arr[i];
			}
		}
		
		System.out.println("FirstMin & SecMin is "+firstMin+" and "+secMin+" sum : "+(firstMin+secMin));
	}
}
