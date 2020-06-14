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
   
   void insertAtStart(int data)
   {
	   Node node = new Node();
	   node.data=data;
	   node.next=null;
	   node.next=front;
	   
	   front=node;
	   
   }
   
   void insertAt(int data, int index)
   {
	   Node node = new Node();
	   node.data=data;
	   node.next=null;
	   
	   if(index==1)
	   {
		   insertAtStart(data);
	   }
	   else
	   {
		   Node n = front;
		   for(int i = 2;i<index;i++)
		   {
			   n=n.next;
			   
		   }
		   node.next=n.next;
		   n.next=node;
		   
	   }
   }
   
   void deleteAt(int index)
   {
	   if(index==1)
	   {
		   deQueue();
		   
	   }
	   else
	   {
		   
		   Node n=front;
		   Node n1=null;
		   
		   for(int i=2;i<index;i++)
		   {
			   n=n.next;
			   
		   }
		   n1=n.next;
		   n.next=n1.next;
	   }
   }
   
   
   void  searchInQueue(int data)
   {
	   Node node=front ;
	   int flag=0;
	  
	   while(node!=null)
	   {
		   if(node.data==data)
		   {
			flag=1;
			System.out.println("searched element found in queue");  
			break;
		   }
		   else
		   {
		   
			   node=node.next;
		   
		   }
		   
		   
	   };
	   
	   if(flag==0)
	   {
		   System.out.println("element to searched  not found");

	   }
   }
   
   void updateElementInQueue(int data, int newData)
   {
	   Node node=front;
	   int flag=0;
	   while(node!=null)
	   {
		   if(node.data==data)
		   {
			   node.data=newData;
			   flag=1;
			   break;
		   }
		  
			   node=node.next;  		   
	   };
	   if(flag==0) 
	   {
		   System.out.println("element to be updated not found");
   
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
