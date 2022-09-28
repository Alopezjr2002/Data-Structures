// this is the interface for the stack
public interface BareBonesStack <E>{
	void push(E obj);	// this is to add elements to the stack
	E pop(); 			// this is to remove elements from the stack
	E peek(); 			// this returns the top element without removing it
	boolean isEmpty();	// this returns true if the stack is empty
	
}
