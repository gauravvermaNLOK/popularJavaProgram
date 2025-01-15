package com.gaurav.popularprograms;

public class LongestCommonPrefix {
	
	
	/**
	 * Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
		Output: “gee”
		Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.
		
		Input: arr[] = [“apple”, “ape”, “april”]
		Output : “ap”
		Explanation: “ap” is the longest common prefix in all the given strings: “apple”, “ape” and “april”.
		
		Input: arr[] = [“hello”, “world”]
		Output: “”
		Explanation: There’s no common prefix in the given strings.
	 **/
	public String getLongestCommonPrefix(String [] arr)
	{
		int len = arr.length;
		String prefix = arr[0];
		for(int i =1; i <len; i++ )
		{
			while(arr[i].indexOf(prefix, 0) != 0 )
			{
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.length() == 0)
					return "";
			}
		}
		return prefix;
	}

}
