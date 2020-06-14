package doublylinkedlist;

public class DoublyLLFunctions
{
	NodeForDll head, tail = null;

	public void insertInDll(int data)
	{
		NodeForDll newNode = new NodeForDll();
		newNode.data = data;

		if (head == null)
		{
			head = tail = newNode;
			head.previous = null;
			head.next = null;

		} else
		{
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;

		}
	}

	void insertAtStart(int data)
	{
		NodeForDll newNode = new NodeForDll();
		newNode.data = data;

		head.previous = newNode;
		newNode.next = head;
		head = newNode;

	}

	void insertAt(int data, int index)
	{
		int counter = 1;
		NodeForDll newNode = new NodeForDll();
		newNode.data = data;
		NodeForDll pointer = head;
		NodeForDll temp;
		if (index == 1)
		{
			insertAtStart(data);
		} else
		{
			while (counter < index - 1)
			{
				pointer = pointer.next;
				counter++;
			}
			;

			temp = pointer.next;

			pointer.next = newNode;
			newNode.next = temp;
			temp.previous = newNode;
			newNode.previous = pointer;
		}
	}

	void showFromFront()
	{
		NodeForDll n = head;
		while (n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;

		}
		;
		System.out.println();

	}

	void showFromReverse()
	{
		NodeForDll n = tail;
		while (n != null)
		{
			System.out.print(n.data + " ");
			n = n.previous;

		}
		;
		System.out.println();

	}
}
