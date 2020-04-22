/*The Time Complexity of enqueue and dequeue operation is O(1)
 * Time Complexity for searching an element is O(n)
 */

package queue;

public class CircularQueueUsingLinkedListRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		CircularQueueUsingLinkedListFunction c = new CircularQueueUsingLinkedListFunction();
		
		c.enQueue(1);
		c.enQueue(2);
		c.enQueue(3);
		c.enQueue(4);
		System.out.println("the size of circular queue is "+c.getSize());
		c.displayCircularQueue();
		c.deQueue();
		c.displayCircularQueue();
		c.updateElementInQueue(4, 87);
		c.displayCircularQueue();
		c.searchInQueue(4);
		System.out.println("the size of circular queue is "+c.getSize());

		
		
	}

}
