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
		l.insertAtStart(43);
		l.insertAt(55, 1);
		l.displayQueue();
		l.deleteAt(2);
		l.displayQueue();
		l.searchInQueue(3);
		l.updateElementInQueue(53, 87);
		l.displayQueue();

		
	}

}
