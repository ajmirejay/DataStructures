/*Run-time complexity of stack operations 
For all the standard stack operations (push, pop, size), 
the worst-case run-time complexity can be O(1). ... push and pop are also O(1) because 
they only work with one end of the data structure - the top of the stack.*/


package stack;

public class StackUsingLInkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLinkedlistFunctions stack = new StackUsingLinkedlistFunctions();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.displayStackFromTopToBottom();
		stack.pop();
		stack.displayStackFromTopToBottom();
		stack.peek();
		System.out.println(stack.sizeOfStack());
	}

}
