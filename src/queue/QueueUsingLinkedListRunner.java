package queue;

public class QueueUsingLinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingLinkedListFunctions l = new QueueUsingLinkedListFunctions();
		l.enQueue(1);
		l.enQueue(2);
		l.enQueue(3);
		l.show();
		l.deQueue();
		l.show();
	}

}
