

// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}
	
	// EXERCISE 2
	void removeBottomHalf() {
		
		int half = size()/2;
		
		// creates a temporary stack to hold the elements
		LinkedStack tempStack = new LinkedStack();

		// if there are elements in the working stack, pop off
		// elements one at a time and push them into the tempStack
		// this results in the flipping of the working stack
		// bottom half is now the top half and can be accessed
		
		while (size() > 0) {
			tempStack.push(pop());
		}
		// removes the top half of the tempStack (bottom of 
		// the original stack) and pops the bottom half of 
		// tempStack (original top half) pushes back into the 
		// working stack... the time complexity of this is O(n). 
		// it loops through every number in the stack once so it 
		// is dependent on the size of the stack (n). 
		for(int i = 0; i < half*2; i++) {
			if (i < half) {
				tempStack.pop();
			}
			if (i >= half) {
				push(tempStack.pop());
			}
		}
		
		

	}

}
