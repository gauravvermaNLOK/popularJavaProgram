package com.gaurav.popularprograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveRepeatedCharsInString {

	
	
	/**
	 * getCharacterCount
	 * Input - "AABBCCD"
	 * Output - A-2, B-2, C-2, D-1
	 * @param String
	 * @return LinkedHashMap<String, Integer>
	 */
	public  LinkedHashMap<String, Integer> getCharacterCount(String str)
	{
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String [] arr = str.split("");
		for(String currentChar: arr)
		{
			if(map.containsKey(currentChar))
			{
				int count = map.get(currentChar);
				map.put(currentChar, count+1);
			}else {
				map.put(currentChar, 1);
			}
		}
		return map;
	}
	
	
	/**
	 * removeDuplicateChar
	 * Input - AABBccd
	 * output - ABcd
	 * @param String
	 * @return String
	 */
	public String removeDuplicateChar(String str)
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		String [] arr = str.split("");
		for(String currentChar : arr)
		{
			set.add(currentChar);
		}
		return String.join("",set);
	}

}
