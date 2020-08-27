// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	// EXERCISE 2
	
	void removeMiddle() {

		int half = size() / 2;

		// creates temporary queue to hold ints
		LinkedQueue tempQ = new LinkedQueue();
		
		// moves all values from linkedQ to tempQ
		while (size() > 0) {
			tempQ.enqueue(dequeue());
		}
		
		// moves the top half back to the linkedQ
		// dequeues the middle int(rounds down if even)
		// moves the rest of the ints to the linkedQ
		// this results in linkedQ having all original ints
		// minus the middle int. 
		for (int i = 0; i < half * 2; i++) {
			if (i < half - 1) {
				enqueue(tempQ.dequeue());
			}

			if (i == half - 1) {
				tempQ.dequeue();

			}
			if (i > half - 1) {
				enqueue(tempQ.dequeue());
			}
		}
	}
}
