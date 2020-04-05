package DataStructures;

public class StackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack nums = new Stack();
nums.push(25);
nums.push(8);
nums.push(43);
nums.push(45);
nums.push(65);

nums.pop();
nums.pop();
nums.pop();
nums.pop();
nums.pop();

nums.pop();


System.out.println("Size of the stack "+nums.size());

System.out.println("Empty ? "+nums.isEmpty());

nums.show();
		
	}

}
