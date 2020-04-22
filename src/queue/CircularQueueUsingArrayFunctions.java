package queue;

public class CircularQueueUsingArrayFunctions
{
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data)
	{
		if(!isFull())
		{
			queue[rear]=data;
			rear=(rear+1)%5;
			size=size+1;
		}
		else
			System.out.println("queue is full");
	}
	
	public int deQueue()
	{
		int data= queue[front];
		if(!isEmpty())
		{	
			
			front=(front+1)%5;
			size=size-1;
		}
		else
			System.out.println("queue is full");
		return data;
		
	}
	
	boolean searchElementsInQueue(int data)
	{
		for(int i=0;i<size;i++)
		{
			if(queue[(front+i)%5]==data)
			{
				return true;
				
			}
		}
		return false;
	}
	
	public int getSize()
	{
		return size;
		
	}
	
	public boolean isEmpty()
	{
		return getSize()==0;
		
	}
	
	public boolean isFull()
	{
		return getSize()==5;
		
	}
	
	public void show()
	{
		System.out.print("Elements :");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%5]+" ");
			
		}
		System.out.println();
		
	}
}
