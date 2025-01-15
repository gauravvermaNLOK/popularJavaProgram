package com.gaurav.popularprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class ProgramExecutor {

	public static void main(String[] args) {
		
		
		NumberPlay numberPlay = new NumberPlay();
		boolean isArmstrong = numberPlay.isArmstrongNumber(1634);
		System.out.println("Is given number Armstrong " + isArmstrong);
		
		boolean isHappyNumber = numberPlay.isHappyNumber(19);
		System.out.println("Is given number Happy Number " + isHappyNumber);
		
		boolean isPalindrom = numberPlay.isPalindromNumber(46355364);
		System.out.println("Is given number Palindrom " + isPalindrom);


		/****************************************************/
		ArrayPlay arrayPlay = new ArrayPlay();
		Integer [] arrSum = arrayPlay.arraySum(new Integer[]{3, 6, 4, 8, 9});
		System.out.println("Output array by taking sum of all elements but skipiing the element at current idex is " + Arrays.asList(arrSum));
		
		int result = arrayPlay.arrayManipulationAndSum(new Integer[]{12, 3, 2, 5, 8}, 20);
		System.out.println("The number which will replace all numbers lesser than it to get desired sum is " + result);
		
		/****************************************************/
		LongestCommonSuffix longestCommonSuffix = new LongestCommonSuffix();
		String strLongestCommonSuffix = longestCommonSuffix.getLongestCommonSuffix(new String[]{"daughter", "flower", "tower"});
		System.out.println("Longest common suffix is " + strLongestCommonSuffix);
		/****************************************************/
		RotateArray rotateArray = new RotateArray();
		rotateArray.leftRotateArrayByGivenIndex(new Integer[] {1,2,3,4,5,6}, 2);
		rotateArray.rightRotateArrayByGivenIndex(new Integer[] {1,2,3,4,5,6}, 2);
		/****************************************************/
		RemoveRepeatedCharsInString removeRepeatedCharsInString = new RemoveRepeatedCharsInString();
		LinkedHashMap<String, Integer> map = removeRepeatedCharsInString.getCharacterCount("AABBCCD");
		System.out.println("Character count in string is " + map);
		String strAfterRemovingDuplicateChars = removeRepeatedCharsInString.removeDuplicateChar("AABccdd");
		System.out.println("String after removing duplicate characters is " + strAfterRemovingDuplicateChars);
		/****************************************************/
		ReverseStringPreservingSpace reverseStringPreservingSpace = new ReverseStringPreservingSpace();
		String strOutput = reverseStringPreservingSpace.reverseStringWithoutChangingSpacePosition("Reverse String but preserve space index");
		System.out.println("Reverse String with preseving space location is " + strOutput);
		/****************************************************/
		LongestCommonSubSequence longestCommonSubSequence = new LongestCommonSubSequence();
		String strLongestCommonSubSequence = longestCommonSubSequence.getLongestCommonSubsequence("ABCD", "ACDBDCD");
		System.out.println("Longest common subsequence  is " + strLongestCommonSubSequence);
		
		/****************************************************/
		String [] arr = {"apple", "app" , "april"};
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		String strPrefix = longestCommonPrefix.getLongestCommonPrefix(arr);
		System.out.println("Longest common prefix is " + strPrefix);
		/****************************************************/	
	}
	

}
