package com.gaurav.popularprograms;

public class LongestCommonSuffix {

	
	/**
	 * Input : {"daughter", "flower", "tower"}, 
	 * Output: "er"
	 * 
	 * Input :  {"Car", "RaceCar", "Bike"}
	 * Output: Zero length String i.e. ""
	 * @param arr
	 * @return
	 */
	public String getLongestCommonSuffix(String [] arr)
	{
		int len = arr.length;
		String prefix = arr[0];
		for(int i =1; i<len; i++)
		{
			while(!arr[i].endsWith(prefix))
				prefix = prefix.substring(1);
			if(prefix.length()==0)
				return "";
		}
		return prefix;
	}

}
