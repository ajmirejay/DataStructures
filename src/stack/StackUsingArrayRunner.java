/*Run-time complexity of stack operations
For all the standard stack operations (push, pop, isEmpty, size), 
the worst-case run-time complexity can be O(1). ... push and pop are also O(1) because 
they only work with one end of the data structure - the top of the stack.*/


package stack;

public class StackUsingArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingArrayFunctions stack = new StackUsingArrayFunctions();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.displayStackFromTopToBottom();
		stack.pop();
		stack.displayStackFromTopToBottom();
		stack.push(4);
		stack.displayStackFromTopToBottom();
		stack.peek();
		stack.sizeOfStack();

	}

}
