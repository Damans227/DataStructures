package DataStructures;

public class Queue {
	
	int Queue[]=new int[5];
	int size;
	int front;
	int rear; 
	
	//Inserting data in queue
	public void enQueue(int data) {
		
		if(!isFull()) {
		Queue[rear]=data;
		rear=(rear+1)%5;
		size=size+1;
		}else {
			System.out.println("Queue is full...  ");
			
		}
	}
	
	//Display the queue
	
	public void show() {
		System.out.println("Elements:  ");
		for(int i=0;i<size;i++) {
			
			System.out.println(Queue[(front+i)%5]+ " ");
		}
		
	}
	
	// Removing data from queue
	public int deQueue() {
		int data = Queue[front];
		if(!isEmpty())
		{
		front=(front+1)%5;
		size--;}else 
		{
			System.out.println("Queue is Empty...  ");
		}
		return data;
	}
	
	//get size of the queue
	public int getSize() {
		
		return size;
	}
	
	//is Empty ?
	
	public boolean isEmpty() {
		
		return size==0;
		
	}
	
	//is full ?
	
public boolean isFull() {
		
		return size==5;
		
	}

}
