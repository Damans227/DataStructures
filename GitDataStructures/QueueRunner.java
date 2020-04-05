package DataStructures;

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Queue q=new Queue();
             q.enQueue(5);
             q.enQueue(2);
             q.enQueue(3);
             q.enQueue(43);
             
             q.deQueue(); 
             q.deQueue();
             
             q.enQueue(12);
             q.enQueue(4);
     
             System.out.println("Size "+q.getSize());
             q.show();
	}

}
