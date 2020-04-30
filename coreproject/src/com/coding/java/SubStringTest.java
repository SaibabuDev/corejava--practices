package com.coding.java;

import java.util.HashSet;

public class SubStringTest {
	 static HashSet<String> set=new HashSet<>();
	public static void main(String[] args) {
		 String str = "abc";
		 	    // SubString(str, str.length());
	        findSubSequences(str);
	}

 
	static void SubString(String str, int length) {
		for(int i=0;i<length;i++){
			
			for(int j=i+1;j<=length;j++){
				System.out.println(str.substring(i, j));
				
			}
			
		}
		
	}
static void findSubSequences(String str) {
		
		for(int i=0;i<str.length();i++){
			
			for(int j=str.length();j>i;j--){
				
				String sub_str=str.substring(i, j);
				if(!set.contains(sub_str)){
					 set.add(sub_str);
				}
			    for (int k = 1; k < sub_str.length() - 1; k++) { 
                    StringBuffer sb = new StringBuffer(sub_str); 
  
                    // drop character from the string 
                    sb.deleteCharAt(k); 
                    if (!set.contains(sb)) ; 
                    findSubSequences(sb.toString()); 
                } 
					
						}
		}
	}


}
