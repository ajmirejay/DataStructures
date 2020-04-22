package queue;

import common.Node;

public class CircularQueueUsingLinkedListFunction
{
	Node front, rear;
	int size;
   
   public CircularQueueUsingLinkedListFunction() 
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
		   size++;
		   return;
	   }
	   else
	   {
		   this.rear.next=temp;
		   this.rear=temp;
		   rear.next=this.front;
		   size++;
		   
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
		   size--;
		   
	   }
	   else 
	   {
		   this.front=this.front.next;
	       this.rear.next=this.front;
	       size--;
       }
   }
  
   void displayCircularQueue()
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
	
   void updateElementInQueue(int data, int newData)
   {
	   Node node=front;
	   int flag=0;
	   
	   while(node.next!=front)
	   {
		   if(node.data==data)
		   {
			   node.data=newData;
			   flag=1;
			   break;
		   }
		   
		   node=node.next;
	   };
	  
	  if(node.data==data)
	   {
		    flag=1;
	   		System.out.println("element found");
	   }
	   
	   if(flag==0)
	   {
		   System.out.println("element not found");
	   }
	   
   }
   
   void searchInQueue(int data)
   {
	   Node node= front;
	   int flag=0;
	   
	   while(node.next!=this.front)
	   {
		   	if(node.data==data)
		   	{
		   		flag=1;
		   		System.out.println("element found");
		   		break;
		   	}
		   	node=node.next;
	   };
	   
	   if(node.data==data)
	   {
		    flag=1;
	   		System.out.println("element found");
	   }
	   if(flag==0)
	   {
		   System.out.println("element not found");
	   }
	}
   
   int getSize()
   {
	  return size; 
	   
   }
	
}
