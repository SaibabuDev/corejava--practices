package datastructure;

/*The Java.util.Stack.pop() method in Java is used to pop an element from the stack. The element is popped from the top of the stack and is removed from the same.

Syntax:

STACK.pop()
Parameters: The method does not take any parameters.
*///Java code to illustrate pop() 
import java.util.*; 

public class StackPopDemo { 
	public static void main(String args[]) 
	{ 
		// Creating an empty Stack 
		Stack<String> STACK = new Stack(); 

		// Use add() method to add elements 
		STACK.push("Welcome"); 
		STACK.push("To"); 
		STACK.push("Geeks"); 
		STACK.push("For"); 
		STACK.push("Geeks"); 

		// Displaying the Stack 
		System.out.println("Initial Stack: " + STACK); 

		// Removing elements using pop() method 
		System.out.println("Popped element: " + 
										STACK.pop()); 
		System.out.println("Popped element: " + 
										STACK.pop()); 

		// Displaying the Stack after pop operation 
		System.out.println("Stack after pop peration "
											+ STACK); 
		// Creating an empty Stack 
        Stack<Integer> STACK1 = new Stack<Integer>(); 
  
        // Use add() method to add elements 
        STACK1.push(10); 
        STACK1.push(15); 
        STACK1.push(30); 
        STACK1.push(20); 
        STACK1.push(5); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + STACK1); 
  
        // Removing elements using pop() method 
        System.out.println("Popped element: " +  
                                         STACK1.pop()); 
        System.out.println("Popped element: " +  
                                         STACK1.pop()); 
  
        // Displaying the Stack after pop operation 
        System.out.println("Stack after pop operation "
                                             + STACK1); 

	} 
} 
