package linkedlist;

import common.Node;

public class LinkedListFunctions 
{
   Node head;
   
   public void insert(int data)
   {
	   Node node=new Node();
	   node.data=data;
	   node.next=null;
	   
	   if(head==null)
	   {
		   head=node;
		   
	   }
	   else
	   {
		    Node n =head;
		   while(n.next!=null)
		   {
			   n=n.next;
		   }
		   n.next=node;
	   }
	   
   }
   
   
   public void insertAtStart(int data)
   {
	   Node node=new Node();
	   node.data=data;
	   node.next=null;
	   node.next=head;
	   
	   head=node;
   }
   
   public void insertAT(int index, int data)
   {
	   Node node =new Node();
	   node.data=data;
	   node.next=null;
	   
	   if(index==1)
	   {
		   insertAtStart(data);
		   
	   }
	   else 
	   {
		   Node n =head;
		   for(int i=2;i<index-1;i++)
		   {
			   n=n.next;
		   }	
	   node.next=n.next;
	   n.next=node;
      }
   }
   
   public void deleteAt(int index)
   {
	   if(index==1)
	   {
		   head.next=head;
		   
	   }
	   else
	   {
		   Node n=head;
		   Node n1=null;
		   for(int i=2;i<index-1;i++)
		   {
			   n=n.next;
		   }
		   n1=n.next;
		   n.next=n1.next;
	   }
	   
   }
   
   boolean searchlinkedList(int data)
   {
	   Node node=head;
	   while(node!=null)
	   {
		 if(node.data==data)
		 {
			 return true;
			 
		 }
		   node=node.next;
	   };
	   
	   return false;
   }
   
   void updateElement(int data, int newData)
   {
	   Node node =head;
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
		   System.out.println("Element not found");
	   }
	   
   }
	   
   public void show()
   {
	   
	   Node n = head;
	   while(n!=null)
	   {
		   System.out.print(n.data+" ");
		   n=n.next;
		   
	   };
	   System.out.println();
   }
}
