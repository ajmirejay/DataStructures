package queue;

import common.Node;

public class QueueUsingLinkedListFunctions
{
  Node rear, front;
  
   QueueUsingLinkedListFunctions()
   {
	   this.rear=this.front=null;
	   
   }
   
   void enQueue(int key)
   {
	   Node temp = new Node(key, null);
	   
	   if(this.rear==null)
	   {
		   this.front=this.rear=temp;
		   return;   
		}
	   this.rear.next=temp;
	   this.rear=temp;
	   
   }
   
   void deQueue()
   {
	   if(this.front==null)
	   {
		   return;
	   }
	   
	   Node temp = this.front;
	   this.front=this.front.next;
	   
	   if(this.front==null)
	   {
		   this.rear=null;
	   }
	   
   }
   
   
   void displayQueue()
   {
	   Node n= front;
	   while(n.next!=null)
	   {
		   System.out.print(n.data+" ");
		   n=n.next;
	   }
	   System.out.println(n.data);
	   
   }
   
}
