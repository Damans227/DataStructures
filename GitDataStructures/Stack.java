package DataStructures;

public class Stack {
	
	int[] stack=new int[5];
	int top=0;
	
	//Pushing the element into the stack
	
	public void push(int data) {
		if(top==5) {
			System.out.println("Stack is full, Sorry!");
		}
		else {
		stack[top]=data;
		top++;
		}
	}
	
	//Printing the Stack
	
	public void show() {
		
		for(int n: stack) {
			System.out.println(n);
		}
	}
	
	//Poping the elements from stack
	
	public int pop() {
		int data=0;
		if(isEmpty()) {
			
			System.out.println("Stack is Empty");
		}
		
		else {
	
		top--;
		data = stack[top];
		stack[top]=0;
	
		}	return data;
	}
	
  // Peeking top of stack
	
	public int peek() {
		int data;
		data = stack[top-1];
		return data;
		
		
	}
	
	//size method, will give size of the stack
	
	public int size() {return top;}
	
	//Ismepty method to check if stack is empty
	
	public boolean isEmpty() {
		
		return top<=0;
	}

}
