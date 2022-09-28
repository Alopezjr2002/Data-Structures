// this is the class for the Stack Implementation using Arrays
public class ArrayStack <E> implements BareBonesStack<E>{
	
	// storage for the stack
	private E[] theData;			// this is the only reference holder
	private int topOfStack = -1; 	// variable to store the top of stack, -1 indicates it is empty
	private static final int INITIAL_CAPACITY = 5;	// this will be the default capacity of the stack
	private static final int EMPTY = -1;			

	
	// constructor for the class
	public ArrayStack() {
		// this actual array needs to be created here, and the reference saved in theData
		this.theData = (E[]) new Object [this.INITIAL_CAPACITY]; 
	}
	
	// overloaded constructor, to create stack of the user given capacity
	public ArrayStack(int capacity) {
		this.theData = (E[]) new Object [capacity]; 
	}
	
	
	
	@Override
	public void push(E obj) {
		// this method is going to add elements to the stack 
		// first check, if there is space to add
		if(this.topOfStack == this.theData.length - 1) {
			// if the last element is at the location capacity - 1, then it is full
			System.out.println("Stack Overflow!");	// if you want, then use reallocate similar to array list implementation
			return;
		}
		// otherwise, there is space to insert
		this.theData[++topOfStack] = obj;
		return;
		
	}

	@Override
	public E pop() {
		// this method deletes an element from the top of stack
		// first check if the stack is empty or not
		if(isEmpty()) {
			// we can call isEmpty method, to check if there is something to delete
			System.out.println("Stack Underflow!");
			return null;
		}
		// Otherwise, there is at least 1 element in the stack, and we can pop the top of stack
		return this.theData[topOfStack--];
		
	}

	@Override
	public E peek() {
		// this method returns an element from the top of stack
		// first check if the stack is empty or not
		if(isEmpty()) {
			// we can call isEmpty method, to check if there is something to delete
			System.out.println("Stack Underflow!");
			return null;
		}
		// Otherwise, there is at least 1 element in the stack, and we can pop the top of stack
		return this.theData[topOfStack];
		
	}

	@Override
	public boolean isEmpty() {
		// this method checks if stack is empty
		return(topOfStack == this.EMPTY);
	}
	
	
	public String toString(){
		String s = "Stack: ";
		// iterate over the elements and add to the String
		for(int i = 0; i <= this.topOfStack; i++) {
			s += this.theData[i] + " | ";
		}
		return s;
	}
	
}
