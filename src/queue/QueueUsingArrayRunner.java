// time complexity for enqueue,dequeue is O(1)

package queue;

public class QueueUsingArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingArrayFunctions queue = new QueueUsingArrayFunctions();
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.displayQueue();
		System.out.println("the size of queue is "+queue.getSize());
		queue.deQueue();
		queue.displayQueue();
		queue.insertElementAtStart(14);
		queue.displayQueue();
		System.out.println("the size of queue is "+queue.getSize());
		System.out.println(queue.searchElementInqueue(3));

	}

}
