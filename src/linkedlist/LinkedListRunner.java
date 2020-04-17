package linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtStart(25);
		list.insertAT(99,2);
		list.show();
		list.deleteAt(2);
		list.show();
	}

}
