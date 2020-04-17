package stack;

import common.Node;

public class StackUsingLinkedlistFunctions 
{
	Node head;
	
	void push(int data)
	{
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=head;
		
		head=newNode;
		
	}
	
	void pop()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
			
		}
		else
		{
			head=head.next;
			
		}
	}
	
	void peek()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
			
		}
		else
		{
			System.out.println("top element is "+head.data);
			
		}
		
	}
	
	void displayStackFromTopToBottom()
	{
		Node n =head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
			
		}
		System.out.print(n.data+" ");
		System.out.println();
	}
	
	int sizeOfStack()
	{
		Node n= head;
		int size=0;
		while(n.next!=null)
		{
			n=n.next;
			size++;
		}
		size++;
		return size;
	}
	
	
	
	
}
