package com.gaurav.popularprograms;

public class NumberPlay {
	
	/**
	 * Given a number x, determine whether the given number is Armstrong’s number or not.
		A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if
		abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... 
		Input:153
		Output: Yes
		153 is an Armstrong number.
		1*1*1 + 5*5*5 + 3*3*3 = 153
		
		
		Input: 120
		Output: No
		120 is not a Armstrong number.
		1*1*1 + 2*2*2 + 0*0*0 = 9
		
		
		Input: 1253
		Output: No
		1253 is not a Armstrong Number
		1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723
		
		
		Input: 1634
		Output: Yes
		1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
		
	 * @param number
	 */
	public boolean isArmstrongNumber(int number)
	{
		int sum =0;
		boolean isArmstrong = false;
		int expectedOutput = number;
		int numberOfDigits = getNumberOfDigits(number);
		while (number != 0)
		{
			int lastDigits = number%10;
			sum = (int) (sum + Math.pow(lastDigits, numberOfDigits));
			number = number/10;
		}
		if (expectedOutput == sum)
			isArmstrong = true;
		return isArmstrong;
	}
	
	private  int getNumberOfDigits(long number)
	{
		return (int)(Long.toString(number).length());
	}
	
	/**
	 * A given number can be said palindromic in nature if the reverse of the given number is the same as that of a given number. In this article, we will write a Program to check if a number is a Palindrome Number in Java.

		Example of Palindrome Number
		
		Input : n = 46355364
		Output: Reverse of n = 46355364
		Palindrome : Yes
		
		
		Input : n = 1234561111111111654321
		Output: Reverse of n = 1234561111111111654321
		Palindrome : Yes
	 * @param number
	 */
	public boolean isPalindromNumber(long number)
	{
		long reverseNumber = getReverseNumber(number);
		if (reverseNumber == number)
			return true;
		return false;
	}
	
	private  long getReverseNumber(long number)
	{
		int numberOfDigits = getNumberOfDigits(number);
		int tempPower = numberOfDigits - 1;
		long reverseNumber = 0;
		while(number != 0)
		{
			long lastDigit = number%10;
			reverseNumber = (long)(reverseNumber + lastDigit*Math.pow(10, tempPower));
			number = number/10;
			tempPower = tempPower - 1;
			
		}
		return reverseNumber;
	}
	
	
	/**
	 * A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1. 

		Examples : 
		
		Input: n = 19
		Output: True
		19 is Happy Number,
		1^2 + 9^2 = 82
		8^2 + 2^2 = 68
		6^2 + 8^2 = 100
		1^2 + 0^2 + 0^2 = 1
		As we reached to 1, 19 is a Happy Number.
		
		Input: n = 20
		Output: False
	 * @param number
	 */
	public   boolean isHappyNumber(int number)
	{
		
		int sumOfSquareOfDigits = number;
		while(sumOfSquareOfDigits>9)
		{
			sumOfSquareOfDigits = getSumOfSquareOfDigits(number);
			
		}
		if(sumOfSquareOfDigits == 1)
			return true;
		return false;
	}
	
	
	private  int getSumOfSquareOfDigits(int number)
	{
		int sum = 0;
		while (number!=0)
		{
			int lastDigit = number%10;
			sum = (int)(sum + Math.pow(lastDigit, 2));
			number = number/10;
		}
		return sum;
	}

}
