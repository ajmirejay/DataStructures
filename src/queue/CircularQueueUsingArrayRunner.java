package queue;

public class CircularQueueUsingArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueUsingArrayFunctions queue = new CircularQueueUsingArrayFunctions();
		
		queue.enQueue(5);
		queue.enQueue(2);
		queue.enQueue(7);
		queue.enQueue(3);
		queue.show();
		queue.deQueue();
	
		queue.show();
		System.out.println("the size of queue is "+queue.getSize());
		
		System.out.println(queue.searchElementsInQueue(3));
	}

}
