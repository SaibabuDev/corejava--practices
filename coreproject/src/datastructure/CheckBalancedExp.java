package datastructure;

import java.util.Stack;

//check if given expression is balanced or not.
// given string containg opening and closing braces, check if it represents a balanced expression or not
//for exmaple {[{}{}]}[()], {{}{}},[](){} are balanced expressions.
// {()}[), {(}) are not balanced.

//Steps to solve 
/* Traverse the given expression
 a) If current character in the expression is opening brace '(' or '{' or '[' , we push it stock.
 b) If current character in the expression is closing brace  ')' or '}' or ']', we pop the character from 
    stack  and we return false if the poped character does  nt pair with cureent character of expression. also if stack 
    		found to be empty, that means the number of opening brraces is less than the number of closing braces at
    		that  point ,so expression can not be balanced.*/
    		
class CheckBalancedExp {

	public static void main(String[] args) {
		String exp="[{()}()]";
		if( isBalancedParathensisExp(exp)){
			System.out.println("expression balanced");
		}
		else 
		{
			System.out.println("expression is not balanced");
		}
		
	}

	public static boolean isBalancedParathensisExp(String exp) {
		Stack<Character> stack=new Stack();
		for(int i=0;i<exp.length();i++){
			if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='['){
				stack.push(exp.charAt(i));				
			}
			//if current char in the expression is closing brace
			if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']'){
				// return false if mismatch is found.
				//if stack is empty, the number of opening braces is lessthan  number of closing braces 
				//so expression can not balanced.
				if(stack.empty()){
					return false;
				}
				//pop character from the stack
				Character top=  stack.pop();
				if(top=='(' && exp.charAt(i)!=')' ||top== '{' && exp.charAt(i)!='}'
						|| top =='[' && exp.charAt(i)!=']'){
					
					return false;
				}
				   
			}
		}
		// expression is balanced only if stack is empty at this point.
		return stack.empty();
	}

	
}
