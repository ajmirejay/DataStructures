/*The Time Complexity of enqueue and dequeue operation is O(1)
 * Time Complexity for searching an element is O(n)
 */

package queue;

public class CircularQueueRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		CircularQueueFunction c = new CircularQueueFunction();
		
		c.enQueue(1);
		c.enQueue(2);
		c.displayCircularQueue();
		c.enQueue(3);
		c.enQueue(4);
		c.displayCircularQueue();
		c.deQueue();
		c.displayCircularQueue();
		
		
		
	}

}
