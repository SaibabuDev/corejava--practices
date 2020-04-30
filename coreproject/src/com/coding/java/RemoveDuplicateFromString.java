package com.coding.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	/*Steps:

		Create LinkedHashSet to maintain insertion-order
		Convert given/test String into character-array using toCharArray(); method
		Iterate through char[] array using enhanced for-each loop
		Leave spaces, as it isn’t considered while deleting/removing duplicate occurrences/characters
		While iterating, check whether character already present in LinkedHashSet
		If not present in LinkedHashSet, then add that particular character into LinkedHashSet using add(); method; otherwise leave it, as it is duplicate character/occurence
		finally, print to console*/
	public static void main(String[] args) {
		
		 // sample test string
        String testStr = "SSS FFF GG RR";
 //Step1: Create LinkedHashSet to maintain insertion-order
        Set<Character> lhset=new LinkedHashSet<Character>();
        // convert given string to character array
      char[] chArray = testStr.toCharArray();
      //iterate through char[] array
      for (int i = 0; i < chArray.length; i++) {
    	  char ch=chArray[i];
    	   if(ch!= ' '){
    		   //check  char already present in the lhset
    		   boolean checkChar=lhset.contains(ch);
    		   if(!checkChar){
    			   lhset.add(ch);
    		   }
    		   
    		   
    	   }
		
	}
        
      System.out.println("After removing duplicate : " + lhset);
        
	}

}
