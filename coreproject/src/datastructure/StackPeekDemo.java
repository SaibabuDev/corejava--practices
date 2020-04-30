package datastructure;

/*Stack peek() Method in Java
The java.util.Stack.peek() method in Java is used to retrieve or fetch the first element of the Stack or the element present at the top of the Stack. The element retrieved does not get deleted or removed from the Stack.

Syntax:

STACK.peek()
Parameters: The method does not take any parameters.
Return Value: The method returns the element at the top of the Stack else returns NULL if the Stack is empty.

Exception: The method throws EmptyStackException if the stack is empty.
*/
import java.util.Stack;

public class StackPeekDemo {

	public static void main(String args[]) 
	{ 
		// Creating an empty Stack 
		Stack<String> STACK = new Stack<String>(); 

		// Use add() method to add elements 
		STACK.push("Welcome"); 
		STACK.push("To"); 
		STACK.push("Geeks"); 
		STACK.push("For"); 
		STACK.push("Geeks"); 

		// Displaying the Stack 
		System.out.println("Initial Stack: " + STACK); 

		// Removing elements using pop() method 
		System.out.println("The element at the top stack is: " + 
										STACK.peek()); 
		
		// Displaying the Stack after pop operation 
		System.out.println("Stack after peek peration "
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
        System.out.println("the element: " +  
                                         STACK1.peek()); 
        System.out.println("the element: " +  
                                         STACK1.peek()); 
  
        // Displaying the Stack after pop operation 
        System.out.println("Stack after peek operation "
                                             + STACK1); 

	}
}
