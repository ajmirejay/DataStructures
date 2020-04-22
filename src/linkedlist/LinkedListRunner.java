//time complexity for insertion is O(1)

package linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListFunctions list = new LinkedListFunctions();
		list.insert(1);                
		list.insert(2);
		list.insert(3);
		list.insertAtStart(25);          
		list.insertAT(2,99); 			 
		list.show();					 
		list.deleteAt(2);
		list.updateElement(1, 75);
		list.show();
		System.out.println(list.searchlinkedList(3));
	}

}
