package DataStructures;

public class SingleDimensionArrayMain {

	public static void main(String[] args) {
	
		System.out.println("Create a blank array of size 10... ");
		SingleDimensionArray sda=new SingleDimensionArray(10);
		System.out.println("Traversing and printing the array");
		sda.traverseArray();
		System.out.println();System.out.println();
		sda.insert(0,0);
		sda.insert(1,10);
		sda.insert(12,120);
		System.out.println();System.out.println();
		System.out.println("Accessing cell number 1...");
		sda.accessingCell(1);
		System.out.println();System.out.println();
		System.out.println("Searching 30 in array...");
		sda.searchInArray(30);
		System.out.println();System.out.println();
		sda.deleteValueFromArray(1);
		System.out.println("Traversing and printing the array");
		sda.traverseArray();
	}

}
