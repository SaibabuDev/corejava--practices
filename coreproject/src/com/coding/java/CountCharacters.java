package com.coding.java;

public class CountCharacters {
	/**
	 * Java program to count the number of occurrence of any character on String.
	 * @author Javin Paul
	 */
	//count number of "a" on this String.
	public static void main(String[] args) {
		
		 String input = "Today is Monday";
		 int len=input.length();
		 int charCount=0;
		 for(int i=0;i<len;i++){
			 if(input.charAt(i)=='a'){
				charCount++;
			 }
			 
		 }
		 System.out.println("given character no timesoccured in the string" +charCount);
		
		 
	}

}
