package doublylinkedlist;

public class DoubleLLRunner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		DoublyLLFunctions dll = new DoublyLLFunctions();
		dll.insertInDll(1);
		dll.insertInDll(2);
		dll.insertInDll(3);
		dll.showFromFront();
		dll.insertAtStart(7);
		dll.showFromFront();
		dll.insertAt(10, 3);
		dll.showFromFront();

		dll.showFromReverse();
	}

}
