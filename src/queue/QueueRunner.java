package queue;

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         QueueUsingArray q = new QueueUsingArray();
         
         q.getSize();
         q.enQueue(5);
         q.enQueue(2);
         q.enQueue(3);
         q.enQueue(6);
         q.enQueue(99);
         q.enQueue(100);
         q.getSize();

         q.show();
         q.deQueue();
         q.show();
         q.deQueue();
         q.show();
	}

}
