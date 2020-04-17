/*The Time Complexity of enqueue and dequeue operation is O(1)
 * Time Complexity for searching an element is O(n)
 */

package queue;

public class QueueUsingLinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingLinkedListFunctions l = new QueueUsingLinkedListFunctions();
		l.enQueue(1);
		l.enQueue(2);
		l.enQueue(3);
		l.displayQueue();
		l.deQueue();
		l.displayQueue();
	}

}
