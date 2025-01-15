package com.gaurav.popularprograms;

import java.util.Arrays;


public class ArrayPlay {
	
	/**
	 * Given an array arr[] of n integers, construct a Sum Array sum[] (of same size) such that sum[i] is equal to the sum of all the elements of arr[] except arr[i]. Solve it without subtraction operator and in O(n).

		Examples:
		
		Input : arr[] = {3, 6, 4, 8, 9} 
		Output : sum[] = {27, 24, 26, 22, 21}
		
		
		Input : arr[] = {4, 5, 7, 3, 10, 1} 
		Output : sum[] = {26, 25, 23, 27, 20, 29}  
	 * @param arr : Integer[]
	 */
	public Integer[] arraySum(Integer[] arr)
	{
		int length = arr.length;
		Integer [] sumArray = new Integer[length];
		for (int i =0; i<length; i++)
		{
			int sum =0;
			for (int j=0; j<length; j++)
			{
				if(i==j)
					continue;
				sum = sum + arr[j];
			}
			sumArray[i]=sum;
		}
		return sumArray;
	}
	
	/**
	 * Given an array arr[] of N integers and an integer S. The task is to find an element K in the array such that if all the elements from the array > K are made equal to K then the sum of all the elements of the resultant array becomes equal to S. If it is not possible to find such an element then print -1 .

	Examples: 
	
	
	Input: S = 15, arr[] = {12, 3, 6, 7, 8} 
	Output: 3 
	Resultant array = {3, 3, 3, 3, 3} 
	Sum of the array elements = 15 = S
	
	Input: S = 20, arr[] = {12, 3, 2, 5, 8} 
	Output: 5 
	Resultant array = {5, 3, 2, 5, 5} 
	Sum of the array elements = 20 = S
	
	Input: S = 5, arr[] = {1, 3, 2, 5, 8} 
	Output: 1 
	 */
	public int arrayManipulationAndSum(Integer[] arr, int expectedSum)
	{
		int result = -1;
		int length = arr.length;
		Arrays.sort(arr);
		int sum = 0;
		for(int i =0; i <length; i++)
		{
			int temp = sum + arr[i]*(length-i);
			sum = sum + arr[i];
			if(temp == expectedSum)
			{
				result = arr[i];
				break;
			}
		}
		return result;
	}

}
