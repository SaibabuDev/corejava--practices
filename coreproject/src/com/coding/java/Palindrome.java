package com.coding.java;

import java.util.Scanner;

/*Given an integer, check whether it is a palindrome or not.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case there will be single line containing single integer N.

Output:
Print "Yes" or "No" (without quotes) depending on whether the number is palindrome or not.

Constraints:
1 <= T <= 1000
1 <= N <= 10000

Example:
Input:
3
6
167
55555
Enter an integer: 1001
Output:
Yes
No
Yes*/
public class Palindrome {
	
	public static void main(String[] args) {
		
 /* Scanner  input=new Scanner(System.in);
  System.out.println("Enter the Number");
        int number=input.nextInt();*/
 // numberIsPlaindrome(number);
 boolean value= wordIsPlaindrome("madam");
 System.out.println(value);
		
	}

	private static boolean wordIsPlaindrome(String str) {
		/*Approach: Take two pointers i pointing to the start of the string and j pointing to the end of the string.
		 *  Keep incrementing i and decrementing j 
		 *  while i < j and at every step check whether the characters at these pointers are same or not. 
		 */
		//If not then the string is not a palindrome else it is.
		
		
		 // Pointers pointing to the beginning 
        // and the end of the string 

		int i=0,j=str.length()-1;
	     // While there are characters to compare
		 while (i < j){
			 // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	         // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
		 }
	 return true;
	}

	private static void numberIsPlaindrome(int num) {
		int reversedN=0,remainder;
		int orginalNum=num;
		while(num!=0){
	     remainder=num%10;  
		 
		 reversedN=reversedN*10+remainder;
		 num=num/10;
		 System.out.println(num);
		}
		
		if (orginalNum == reversedN)
	        System.out.println("Num is a palindrome."+ orginalNum);
	    else
	        System.out.println("Num is not a palindrome." + reversedN);
	    
	}

	
}
