package com.gaurav.popularprograms;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubSequence {

	
	/**
	 * Input: str1 = “ABCD”, str2 = “ACDBDCD”
	Output: ACD
	Explanation:
	“ACD” is longest subsequence of X which is substring of Y.
	
	
	Input: str1 = A, str2 = A
	Output: A
	
	Subsequence: A subsequence of a string is a sequence of characters that can be derived 
	from the original string by deleting some or no characters without changing the order 
	of the remaining characters.
	 * @param str1
	 * @param str2
	 * return String
	 */
	public String getLongestCommonSubsequence(String str1, String str2)
	{
		Set<String> subSequences = getAllSubSequences(str1);
		String strLongestSubString = "";
		for(String str: subSequences)
		{
			if (str2.contains(str) && str.length()> strLongestSubString.length())
			{
				strLongestSubString = str;
			}
		}
		return strLongestSubString;
		
	}
	
	
	/**
	 * Sub sequences of ABC shall be [, A, AB, BC, B, AC, ABC, C]
	 * @param str
	 * @return Set<String>
	 */
	private Set<String> getAllSubSequences(String str)
	{
		Set<String> subSequences = new HashSet<String>();
		subSequences.add("");
		for(char c : str.toCharArray())
		{
			Set<String> newSubSequences = new HashSet<String>();
			for (String sequence : subSequences)
			{
				newSubSequences.add(sequence + c);
			}
			subSequences.addAll(newSubSequences);
		}
		return subSequences;
	}
}
