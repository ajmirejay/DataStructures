// time complexity of circular queue is O(1)

package queue;

public class CircularQueueRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		CircularQueueFunction c = new CircularQueueFunction();
		
		c.enQueue(1);
		c.enQueue(2);
		c.show();
		c.enQueue(3);
		c.enQueue(4);
		c.show();
		c.deQueue();
		c.show();
		
		
		
	}

}
