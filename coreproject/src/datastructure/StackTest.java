package datastructure;

public class StackTest {

	private int array[];
	private int top;
	private int capacity;
	public StackTest(int capacity) {
		
		this.array = new int[capacity];
		this.top = -1;
		this.capacity = capacity;
	}
	public void push(int item){
		if(isFull()){
			throw new RuntimeException("stack is full");
		}
		array[++top]=item;
	}
	public int pop(){
		if(isEmpty()){
			throw new RuntimeException("stack is empty");
			
		}
		return array[top--];
	}
	public int peek(){
		return array[top];
						
	}
public boolean isEmpty(){
		
		return top == -1;
		
	}
public boolean isFull(){
	return top == capacity-1;
}
public static void main(String[] args) {
	
	StackTest stack=new StackTest(10);
	stack.push(10);
	System.out.println(stack.pop());
	stack.pop();
	
	
}
}
