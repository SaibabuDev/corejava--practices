package com.coding.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMaximumNum {
	  public static void main(String[] args)  
	    { 
	        String str = "100klh564abc365bg"; 
	        System.out.println(extractMaximum(str)); 
	        System.out.println(extractMaximumRegEx(str));
	    }

	// Method to extract the maximum value 
	    static int extractMaximum(String str) 
	    { 
	        int num = 0, res = 0; 
	       
	        // Start traversing the given string 
	        for (int i = 0; i<str.length(); i++) 
	        { 
	            // If a numeric value comes, start converting 
	            // it into an integer till there are consecutive 
	            // numeric digits 
	            if (Character.isDigit(str.charAt(i))) 
	                num = num * 10 + (str.charAt(i)-'0'); 
	       
	            // Update maximum value 
	            else
	            { 
	                res = Math.max(res, num); 
	       
	                // Reset the number 
	                num = 0; 
	            } 
	        } 
	     // Return maximum value 
	     return Math.max(res, num);
	    }
	    
	 // Method to extract the maximum value 
	    static int extractMaximumRegEx(String str) 
	    { 
	        // regular expression for atleast one numeric digit 
	        String regex = "\\d+"; 
	          
	        // compiling regex 
	        Pattern p = Pattern.compile(regex); 
	          
	        // Matcher object 
	        Matcher m = p.matcher(str); 
	          
	        // initialize MAX = 0 
	        int MAX = 0; 
	        //  BigInteger MAX = BigInteger.ZERO;     
	        // loop over matcher 
	        while(m.find()) 
	        { 
	            // convert numeric string to integer 
	            int num = Integer.parseInt(m.group()); 
	            // convert numeric string to BigIntegr 
	          //  BigInteger num = new BigInteger(m.group()); 
	           
	            // compare num with MAX, update MAX if num > MAX 
	            if(num > MAX) 
	                MAX = num; 
	        } 
	           
	        return MAX;     
	    } 
	    
}
