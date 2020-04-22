package queue;

public class QueueUsingArrayFunctions
{
	int queue[] = new int[10];
	int front=-1;
	int rear=-1;
	int size=0;
	
	void enQueue(int data) 
	{
		
		if(rear==9) 
		{
			System.out.println("queue is full");
			
		}
		else if(front==-1 && rear==-1)
			{
				front=rear=0;
				queue[rear]=data;
				size++;
			
			}
		else
		{
			
			rear++;
			queue[rear]=data;
			size++;
		}
		
	}
	
	void deQueue()
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("queue is empty");
		}
		else if(front==rear) 
		{
			front=rear=-1;
			size--;
		}
		else
		{
			int data=queue[front];
			front++;
			size--;
			
		}
		
	}
	
	void displayQueue()
	{
		if(front==-1&&rear==-1) 
		{
			System.out.println("queue is empty");
			
		}
		else 
		{
			for(int i=front;i<rear+1;i++)
			{
				System.out.print(queue[i]+" ");
				
			}
			
		}
		System.out.println();

	}
	
	void insertElementAtStart(int data)
	{
		if(front==-1&&rear==-1)
		{
			enQueue(data);
		}
		else if(rear==9)
			{
				System.out.println("queue is full");
			}	
		else
		{
			rear++;
			for(int i=rear+1;i>0;i--)
			{
				queue[i]=queue[i-1];
			
			}
		queue[front]=data;
		size=size+1;
		}
	}
	
	boolean searchElementInqueue(int data)
	{
		for(int i=front;i<rear+1;i++)
		{
			if(queue[i]==data)
			{
				return true;
			}
		}
		
		return false;
	}
	
	int getSize()
	{
		
		return size;
	}
	
	
	
}
