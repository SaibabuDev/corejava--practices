package com.coding.java;

import java.util.Arrays;

/*Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 1016

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.
*/ 
public class Anagram {
	
	public static void main(String[] args) {
		 boolean status = true; 
		 
		 String str1 = "keep";
		 String str2 = "peek";
		 String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");
		//convetred strings char array 
		char[] arrayS1= s1.toCharArray();
		char[] arrayS2= s2.toCharArray();
		
		
		 if (areAnagram(arrayS1, arrayS2)) 
	            System.out.println("The two strings are"
	                               + " anagram of each other"); 
	        else
	            System.out.println("The two strings are not"
	                               + " anagram of each other"); 
	  
	      
	}

static boolean areAnagram(char[] str3, char[] str4) {
	 int n1=str3.length;
	 int n2=str4.length;
	 if(n1!=n2){
		 return false;
	 }
	// Sort both strings 
     Arrays.sort(str3); 
     Arrays.sort(str4); 
     
     // Compare sorted strings 
     for (int i = 0; i < n1; i++) {
         if (str3[i] != str4[i]) 
             return false; 
	
	}
return true;
	 
	
}
}
