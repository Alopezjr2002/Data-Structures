// this is where we create the Stack object and test the methods
public class StackDriver {

	public static void main(String[] args) {
		// lets create a stack of integers
		ArrayStack<Integer> myStack = new ArrayStack<>(6);
		myStack.push(20);
		System.out.println(myStack);
		myStack.push(30);
		System.out.println(myStack);
		myStack.push(40);
		System.out.println(myStack);
		myStack.push(50);
		System.out.println(myStack);
		myStack.push(60);
		System.out.println(myStack);
		System.out.println("The top of stack is: " + myStack.peek());
		myStack.push(70);
		System.out.println(myStack);
		myStack.push(80);
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		System.out.println("The top of stack is: " + myStack.peek());


	}
}
