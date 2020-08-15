package com.ashokIt;

//		9)Write a Java program to find element Pairs in given Array whose sum is equal to given number
//			Input Array :  {3, 6, 8, -8, 10, 8 } 
//			Sum : 16
//			Output :  Pairs with sum 16 are (6, 10) and (8, 8)

public class Array9 {

	public static void main(String[] args) {
		
		int arr[] = {3, 6, 8, -8, 10, 8 };
		
		int num=16;
		System.out.println("Number is : "+num);
		
		for(int i=0;i<arr.length;i++)
		{		
			for(int j=i+1;j<arr.length;j++)
			{
				if(num==(arr[i]+arr[j]))
				{
					System.out.println("Pair is : "+arr[i]+" "+arr[j]);
					break;
				}		
			}
		}
	}
}
