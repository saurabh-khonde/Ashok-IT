package com.ashokIt;

//		4)Write a Java program to find third largest number in given Array ?
//		
//			Input = { 6, 8, 1, 9, 2, 1, 10}
//			Output: Third largest element : 8
//			
//			Int [] a = { 6, 8, 1, 9, 2, 1, 10, 12}
//			Output: Third largest element : 9
//			
//			Int [] a = {6}
//			Output: Invalid Input, array size is less than 3

public class Array4 {

	public static void main(String[] args) {
		
		int[] arr = { 6, 8, 1, 9, 2, 1, 10, 12};
		
		int length = arr.length;
		int count=0;
		int temp;
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[j+1];
					count++;
					break;
				}
					
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}		
			}
		}
		
		for(int i=0;i<arr.length-count;i++)
			System.out.print(arr[i]+" ");
		
		System.out.print("\n "+4+"th Largest : "+arr[3]);
		
	}
}
