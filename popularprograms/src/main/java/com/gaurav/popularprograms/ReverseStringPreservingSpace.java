package com.gaurav.popularprograms;


public class ReverseStringPreservingSpace {

	
	/**
	 * Input  : "abc de"
		Output : edc ba
		
		Input : "intern at geeks"
		Output : skeegt an retni
		
		Input : "Help others"
		Output : sreh topleH
	 * @param str
	 */
	public  String reverseStringWithoutChangingSpacePosition(String str)
	{
	
		int lenOfString = str.length();
		String [] arr = str.split("");
		
		String [] arrReverse = new String[lenOfString];//Array to store reverse string
		//Put spaces in output array i.e. arrReverse
		for(int i =0; i<lenOfString; i++)
		{
			if(arr[i].equals(" "))
				arrReverse[i] = " ";
		}
		
		int indexToInsert = lenOfString - 1;//Index to insert in arrReverse
		//Iterate input string from the begining and insert into outPut array from the last index
		for(int k =0; k <lenOfString; k++)
		{
			//if output array already has space then decrease index by 1
			if(arrReverse[indexToInsert]!= null && arrReverse[indexToInsert].equals(" "))
				indexToInsert--;
			//If input array has space then don't do anything 
			//as we have already inserted space in output array i.e. arrReverse
			if(arr[k].equals(" "))
				continue;
			arrReverse[indexToInsert] = arr[k];
			indexToInsert--;
		}
		
		return String.join("", arrReverse);
	}
	

	

}
