package queue;

public class QueueUsingArrayFunction 
{
	int size;
    
	int queue[] = new int[6];
	
    int front, rear;
    
    public void enQueue(int data)
    {
    	if(!isFull())
    	{
          queue[rear] = data;	
          rear= (rear+1)%6;
          size++;
    	}
    	else 
    		System.out.println("queue is full ");
    }
    
    public int deQueue()
    {
    	int data=queue[front];
    	front=(front+1)%6;
    	size--;
    	return data;
    }
    
    public int getSize()
    {
    	
    	return size;
    	
    }
    public Boolean isEmpty()
    {
    	return getSize()==0;
    	
    }
    public Boolean isFull()
    {
    	return getSize()==6;
    	
    }
    
    public void show()
    {
    	System.out.println("Elements :");
    	 for( int i=0;i<size;i++)
    	 {
    		 System.out.print(queue[(front+i)%6] +" ");
    		 
    	 }
    	 System.out.println(" ");
    }
    
}
