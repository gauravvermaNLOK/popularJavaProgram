# popularJavaProgram

**1. ArrayPlay.java**
   a./**
	 * Given an array arr[] of n integers, construct a Sum Array sum[] (of same size) such that sum[i] is equal to the sum of all the elements of arr[] except arr[i]. Solve it without subtraction operator and in O(n).

		Examples:
		
		Input : arr[] = {3, 6, 4, 8, 9} 
		Output : sum[] = {27, 24, 26, 22, 21}
		
		
		Input : arr[] = {4, 5, 7, 3, 10, 1} 
		Output : sum[] = {26, 25, 23, 27, 20, 29}  
	 * @param arr : Integer[]
	 * @return Integer[]
	 */
 b. /**
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
	 * @param arr Integer[]
	 * @param expectedSum int
	 * @return int
	 */

  **2. LongestCommonPrefix.java**
    a. /**
	 * 	Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
		Output: “gee”
		Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.
		
		Input: arr[] = [“apple”, “ape”, “april”]
		Output : “ap”
		Explanation: “ap” is the longest common prefix in all the given strings: “apple”, “ape” and “april”.
		
		Input: arr[] = [“hello”, “world”]
		Output: “”
		Explanation: There’s no common prefix in the given strings.
	 * @param arr String[]
	 * @return String
	 */

**3. LongestCommonSubSequence.java**
    a.  /**
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

  **4. LongestCommonSuffix**
     a.  /**
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

  **5. NumberPlay**
     a. /**
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
	 * @return boolean
    
	 */ 

  b. /**
	 * A given number can be said palindromic in nature if the reverse of the given number is the same as that of a given number. In this article, we will write a Program to check if a number is a Palindrome Number in Java.

		Example of Palindrome Number
		
		Input : n = 46355364
		Output: Reverse of n = 46355364
		Palindrome : Yes
		
		
		Input : n = 1234561111111111654321
		Output: Reverse of n = 1234561111111111654321
		Palindrome : Yes
	 * @param number
	 * return boolean
	 */

  c. /**
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
	 * return boolean
	 */

  **6. RemoveRepeatedCharsInString**
     
     a. /**
	 * getCharacterCount
	 * Input - "AABBCCD"
	 * Output - A-2, B-2, C-2, D-1
	 * @param String
	 * @return LinkedHashMap<String, Integer>
    
	 */
  
    b. /**
	 * removeDuplicateChar
	 * Input - AABBccd
	 * output - ABcd
	 * @param String
	 * @return String
	 */

**7. ReverseStringPreservingSpace**
     a. /**
	 * Input  : "abc de"
		Output : edc ba
		
		Input : "intern at geeks"
		Output : skeegt an retni
		
		Input : "Help others"
		Output : sreh topleH
	 * @param str
	 */

**8. RotateArray**
     
    a. /**
	 * rightRotateArrayByGivenIndex
	 * Input - {a,b,c,d,e,f} Rotate it by 2 index to the right side
	 * Step1. Capture last element i.e.f 
	 * Step2. Shift all element by 1 position e.g. {null,a,b,c,d,e}
	 * Step3. Place last element at first position
	 * Step4. Repeat Step1,2,3 
	 * Output - {e,f,a,b,c,d}
	 * @param arr Object[]
	 * @param index int
    
	 */
  
    b. /**
	 * leftRotateArrayByGivenIndex
	 * Input - {a,b,c,d,e,f} Rotate it by 2 index to the left side
	 * Step1. Capture first element i.e.f 
	 * Step2. Shift all elements to left by 1 position e.g. {b,c,d,e, f, null}
	 * Step3. Place first element at last position {b,c,d,e, f, a}
	 * Step4. Repeat Step1,2,3 
	 * Output - {c,d,e,f,a,b}
	 * @param arr Object[]
	 * @param index int
	 */
