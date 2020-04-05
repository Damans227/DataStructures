package DataStructures;

public class SingleDimensionArray {
int arr[]=null;
	// Constructor
	
	public SingleDimensionArray(int sizeOfArray) {
		arr=new int[sizeOfArray];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=Integer.MIN_VALUE; //initialize the array with some values
		}
		
	}
	
	//Print the array, i.e traverse

	public void traverseArray() {
		
		try {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
		} catch(Exception e) {
			System.out.println("Array no longer exists..");
					
		}	
	}
	//Insertion 
	public void insert(int location, int valueToBeInserted) {
		try {
if(arr[location]==Integer.MIN_VALUE) {
	arr[location]=valueToBeInserted;
	System.out.println("Successfully Inserted "+ valueToBeInserted + " at location: "+location);
	
}else {
	System.out.println("This cell is already occupied");
}
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index to access array! ");
	}
	}
	//Accessing a cell
	
	public void accessingCell(int cellNumber) {
		
		try {
			System.out.println(arr[cellNumber]);
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Invalid index to access array! ");
		}
	}
	//Searching an element
	public void searchInArray(int valueToSearch) {
		
		for(int i=0;i<arr.length;i++) {
			
			if (arr[i]==valueToSearch) {
				System.out.println("Value Found...");
				System.out.println("Index of "+ valueToSearch +" is: "+ i);
				return;
			}
		}System.out.println(valueToSearch +" not found ");
	}
	
	// Deleting a value
	
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell]=Integer.MIN_VALUE;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array! ");
			
		}
		
		
	}
	
}
