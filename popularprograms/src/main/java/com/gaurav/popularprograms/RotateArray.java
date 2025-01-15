package com.gaurav.popularprograms;

import java.util.Arrays;

public class RotateArray {

	/**
	 * Input - {a,b,c,d,e,f} Rotate it by 2 index to the right side
	 * Step1. Capture last element i.e.f 
	 * Step2. Shift all element by 1 position e.g. {null,a,b,c,d,e}
	 * Step3. Place last element at first position
	 * Step4. Repeat Step1,2,3 
	 * Output - {e,f,a,b,c,d}
	 * @param arr
	 * @param index
	 */
	public  void rightRotateArrayByGivenIndex(Object [] arr, int index)
	{
		int count = 1;
		while(count <= index)
		{
			arr = rotateArrayRightByOne(arr);
			count++;
		}
		System.out.println("Array after rotaing it right by " + index + " position is " +Arrays.asList(arr));
	}

	private  Object[] rotateArrayRightByOne(Object [] arr)
	{
		int len = arr.length;
		Object lastElement = arr[len-1];
		Object [] arrAfterRotation = new Object[len];
		for(int i = 1; i<len; i++)
		{
			arrAfterRotation[i]= arr[i-1];
		}
		arrAfterRotation[0]= lastElement;
		return arrAfterRotation;
	}
	
	/**
	 * Input - {a,b,c,d,e,f} Rotate it by 2 index to the left side
	 * Step1. Capture first element i.e.f 
	 * Step2. Shift all elements to left by 1 position e.g. {b,c,d,e, f, null}
	 * Step3. Place first element at last position {b,c,d,e, f, a}
	 * Step4. Repeat Step1,2,3 
	 * Output - {c,d,e,f,a,b}
	 * @param arr
	 * @param index
	 */
	public  void leftRotateArrayByGivenIndex(Object [] arr, int index)
	{
		int count = 1;
		while(count <= index)
		{
			arr = leftRotateArrayByOne(arr);
			count++;
		}
		System.out.println("Array after rotaing it left by " + index + " position is " + Arrays.asList(arr));
	}
	
	
	
	private Object [] leftRotateArrayByOne(Object [] arr)
	{
			int len = arr.length;
			Object firstElement = arr[0];
			Object [] arrAfterRotation = new Object[len];
			for(int i = 0; i<len-1; i++)
			{
				arrAfterRotation[i]= arr[i+1];
			}
			arrAfterRotation[len-1]= firstElement;
			return arrAfterRotation;
	}
}
