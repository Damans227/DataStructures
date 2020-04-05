package DataStructures;

public class LinkedList {
Node head;

//insert a new node at the end

public void insert(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(head==null) {
		head=node;
		}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
}

//insert a new node at the beginning

public void insertAtStart(int data) {
	
	Node node=new Node();
	node.data=data;
	node.next=null;
	node.next=head;
	head= node;
	
	
}

//insert a new node at any location

public void insertAt(int index, int data) {
	
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(index==0) {
		
		insertAtStart(data);
		
	}
	else {
	Node temp = head; 
	for(int i=0;i<index-1;i++) {
		temp=temp.next;
	}
	node.next=temp.next;
	temp.next=node;
}

}

// delete

public void deleteAt (int index) {
	
	if(index==0) {
		head=head.next;	
	} else {
		
		Node temp =head;
		Node temp1=null;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		temp1=temp.next;
		temp.next=temp1.next;
	}
	
}


public void show() {
	
	Node node = head;
	
	while(node.next!=null) {
		
		System.out.println(node.data);
		node=node.next;
	}System.out.println(node.data);
}

}
