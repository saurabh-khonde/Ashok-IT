package com.ashokIt;

//		7)Write Java Program to find second Min and Second Max elements in given Array ?
//			Input: 1, 2, 5, 9, 6, 4, 7, 2
//			Output: Second Min-2  Second Max-7

public class Array7 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,9,6,4,7,2};
		
		int firstMin=arr[0], secMin=arr[1];
		int firstMax=arr[0], secMax=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(firstMin>arr[i])
				firstMin=arr[i];
			
			if(firstMax<arr[i])
				firstMax=arr[i];
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(secMin>firstMin && secMin>arr[j])
			{
				if(firstMin!=arr[j])
					secMin=arr[j];
			}
				
			
			if(secMax<firstMax && secMax<arr[j])
			{
				if(firstMax!=arr[j])
					secMax=arr[j];
			}
				
		}
		
		System.out.println("Sec Min : "+secMin + " , " + "Sec Max : "+secMax);
	}
}
