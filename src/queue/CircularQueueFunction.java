package queue;

import common.Node;

public class CircularQueueFunction
{
	Node front, rear;
   
   public CircularQueueFunction() 
   {
	   this.front=this.rear=null;
   }
   
   void enQueue(int data)
   {
	   Node temp = new Node();
	   temp.data=data;
	   temp.next=null;
	   
	   if(rear==null)
	   {
		   this.front=this.rear=temp;
		   rear.next=this.front;
		   return;
	   }
	   else
	   {
		   this.rear.next=temp;
		   this.rear=temp;
		   rear.next=this.front;
		   
	   }
   }
   
   void deQueue()
   {
	   if(this.front==null&&this.rear==null)
	   {
		   System.out.println("Circular queue is empty");
		   
	   }
	   else if(this.front==this.rear)
	   {
		   this.front=this.rear=null;
		   
	   }
	   else 
	   {
		   this.front=this.front.next;
	       this.rear.next=this.front;
       }
   }
  
   void show()
   {
	   
	  Node n =this.front;
	   while(n.next!=front)
	   {
		   System.out.print(n.data+" ");
		   n=n.next;
		   
	   }
	   System.out.print(n.data+" ");
	   System.out.println();
   }
	
	
}
