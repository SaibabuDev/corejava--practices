package datastructure;
// Java code to illustrate push() method 

import java.util.Stack;

public class StackDemo { 
	public static void main(String args[]) 
	{ 
		// Creating an empty Stack 
	Stack<String> STACK = new Stack<String>(); 

		// Use push() to add elements into the Stack 
		STACK.push("Welcome"); 
		STACK.push("To"); 
		STACK.push("Geeks"); 
		STACK.push("For"); 
		STACK.push("Geeks"); 

		// Displaying the Stack 
		System.out.println("Initial Stack: " + STACK); 

		// Pushing elements into the stack 
		STACK.push("Hello"); 
		STACK.push("World"); 

		// Displaying the final Stack 
		System.out.println("Final Stack: " + STACK); 
		
		
		 // Creating an empty Stack 
        Stack<Integer> STACK1 = new Stack<Integer>(); 
  
        // Use push() to add elements into the Stack 
        STACK1.push(10); 
        STACK1.push(15); 
        STACK1.push(30); 
        STACK1.push(20); 
        STACK1.push(5); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + STACK1); 
  
        // Pushing elements into the Stack 
        STACK1.push(1254); 
        STACK1.push(4521); 
  
        // Displaying the final Stack 
        System.out.println("Final Stack: " + STACK1); 
   
	} 
} 
