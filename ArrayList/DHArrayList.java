public class DHArrayList<E> implements BareBonesArrayList<E> {
	
	//Data
	private int size; //how many elements are there?
	private int capacity; //how big is the array?
	private E[] myArray; // reference to the real array, not yet created
	private static final int INITIAL_CAPACITY = 10; // default capacity
		
	//Constructor
	public DHArrayList() {
		this.capacity = this.INITIAL_CAPACITY;
		this.size = 0; // there are no elements in the array list when we create it
		myArray = (E[]) new Object[this.capacity]; // this creates the actual array list
		
	}
	
	// Overloaded Constructor
	public DHArrayList(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		myArray = (E[]) new Object[this.capacity]; 

	}	
	
	@Override
	public void add(E a) {
		// this method adds an element to the end of the list
		// first we need to check to see if there is space in the array list
		if(this.size < this.capacity) {
			// this means there is space
			// the last index in the array list is given by the size
			myArray[size] = a; // insert element no problem	
			size++; // update number of elements
		}
		else {
			// no more space available, need to call reallocate()
			System.out.println("There is no space, calling reallocate");
			this.reallocate();
			this.add(a); // once reallocated provides the space, call add again
			
		}
		
	}

	private void reallocate() {
		// this method will double the size of the array
		this.capacity *= 2;
		E[] temp = (E[]) new Object[this.capacity]; // new array with double capacity created
		// copy elements from old array into the new array
		for (int i = 0; i < myArray.length; i++){
			// iterate over the array and insert the elements into the new one
			temp[i] = myArray[i];
			
		}
		// once the copying is done, update the reference
		
		this.myArray = temp; // pointing to the new array
	}

	@Override
	public void add(E a, int index) {
		// this method adds at a given index
		// check if the index is valid
		if (index < 0 || index > size) {
			System.out.println("Invalid index!");
			return;
		}
		else if(index == size) {
			// we are trying to add at the end of the array list
			this.add(a);
		}
		else {
			// we have valid index, and need shifting of elements
			// check if there is space to shift, if not call reallocate
			
			if (this.size == this.capacity) {
				// array is full
				this.reallocate();
			}
			
			// once reallocate is done, we have space to shift elements
			// we need to shift all elements from index to end one position to the right
			// copy over the elements from the last one to the index
			for(int i = size; i > index; i--) {
				this.myArray[i] = this.myArray[i-1];
			}
			
			// once elements are shifted, insert the data
			this.myArray[index] = a;
			this.size++; // update how many elements
		}
		
	}

	@Override
	public E remove(int index) {
		// this method will delete the element at given index
		// first check if index is valid
		if (index < 0 || index > size) {
			System.out.println("Invalid index!");
			return null;
		}
		
		// shifting might be required
		// save the element to be deleted so that it can be returned
		E temp = myArray[index];
		// shift left
		for(int i = index; i < size-1; i++) {
			this.myArray[i] = this.myArray[i+1];
		}
		this.size--; // decrease number of elements in the array 
		
		return temp; // return deleted item
	}

	@Override
	public E get(int index) {
		// this method will returns the element at index, but does not delete it
		// first check if index is valid
		if (index < 0 || index > size) {
			System.out.println("Invalid index!");
			return null;
		}
		return myArray[index]; // if the index is valid, return the element at given index
	}

	@Override
	public void set(E a, int index) {
		// this method will update the element at given index
		// first check if index is valid
		if (index < 0 || index > size) {
			System.out.println("Invalid index!");
			return;
		}
		
		myArray[index] = a; // if the index is valid, update the value
		return;
		
	}

	@Override
	public int getsize() {
		// this method returns how many elements are there in the array list
		return this.size;
	}

	@Override
	public int indexOf(E a) {
		// this method searches for a value in the array list, if found return the index
		// first we have to iterate through the array list
		for(int i = 0; i < this.size; i++) {
			// check to see if current value matches with given value
			if (myArray[i] == a) {
				// we have a match
				return i;
			}
			
		}
		// the given value does not exist in array list
		System.out.println("This value does not exist in array list");
		return -1;
	}
	
	
	// implement toString() method
	// converts the data in the data Structure into a string, and returns it[
	
	public String toString() {
		//this method returns the contents of the array into a String
		String s = " ";
		// we will iterate over the elements and add to the String
		
		for (int i = 0; i < this.size; i++) {
			s = s + myArray[i] + ", "; // ", " this is for better formating
		}
		// return the string
		
		return s;
				
	
	}

	

	

}
