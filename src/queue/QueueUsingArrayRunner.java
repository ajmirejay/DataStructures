package queue;

public class QueueUsingArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArrayFunctions queue = new QueueUsingArrayFunctions();
		
		queue.enQueue(5);
		queue.enQueue(2);
		queue.enQueue(7);
		queue.enQueue(3);
		queue.show();
		queue.deQueue();
		queue.deQueue();
		queue.show();
		queue.enQueue(9);
		queue.enQueue(1);
		
		queue.deQueue();

		System.out.println("size "+queue.getSize());
		queue.show();
	}

}
