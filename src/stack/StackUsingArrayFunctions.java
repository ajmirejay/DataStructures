package stack;

public class StackUsingArrayFunctions 
{
	int stack[] =new int[5];
	int top=-1;
	
	void push(int data)
	{
		if(top==4) 
		{
			System.out.println("overflow");
			
		}
		else
		{
			top++;
		    stack[top]=data;
			
		}
		
	}
	
	void pop()
	{
		int data;
		if(top==-1)
		{
			System.out.println("underflow");
			
		}
		else
		{
			data=stack[top];
			top--;
		}
		
	}
	
	void peek()
	{
		if(top==-1)
		{
			System.out.println("underflow");
			
		}
		else
		{
	    	System.out.println("The top element is "+stack[top]);
		}
	}
	void displayStackFromTopToBottom()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
			
		}
		System.out.println();
	}
	
	void sizeOfStack()
	{
		top++;
		System.out.println("Size of stack is  "+top);
		
	}
}








