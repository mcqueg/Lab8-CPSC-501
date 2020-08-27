//********************************************************************
// Garrett McCue 	
//
// 8/24/20
//
// CPSC-501-Lab8Ex1&2
//**********************************************************************
public class Driver {

	public static void main(String[] args) {

		// create instance of arrayQ
		ArrayQ arrayQ = new ArrayQ();

		// enqueue method to assign numbers to arrayQ
		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);

		// create instance of linkedQueue
		LinkedQueue linkedQ = new LinkedQueue();

		// enqueue method to assign numbers to linkedQueue
		linkedQ.enqueue(1);
		linkedQ.enqueue(7);
		linkedQ.enqueue(3);
		linkedQ.enqueue(4);
		linkedQ.enqueue(9);
		linkedQ.enqueue(2);

		// dequeue elements in arrayQ and prints them
		System.out.println("Array: ");
		while (arrayQ.size() > 0) {
			System.out.println(arrayQ.dequeue());
		}

		// dequeue elements in linkedQueue
		System.out.println("\nLinked: ");
		while (linkedQ.size() > 0) {
			System.out.println(linkedQ.dequeue());
		}

		// updates linkedQ for exercise 2
		linkedQ.enqueue(2);
		linkedQ.enqueue(9);
		linkedQ.enqueue(1);
		linkedQ.enqueue(4);

		// execute removeMiddle() and test that it worked
		linkedQ.removeMiddle();

		System.out.println("\nLinked (middle removed): ");
		while (linkedQ.size() > 0) {
			System.out.println(linkedQ.dequeue());

		}
	}
}
