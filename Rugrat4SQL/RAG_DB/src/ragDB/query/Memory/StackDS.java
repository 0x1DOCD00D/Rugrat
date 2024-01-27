/**
 * 
 */
package ragDB.query.Memory;

/**
 * @author Arthi
 * Stack DS to store nested Queries
 */
public class StackDS implements Stack {

	private Object[] theArray;
	private int topOfStack;
	private static final int DEFAULT_CAPACITY = 31;

	public StackDS() {
		theArray = new Object[DEFAULT_CAPACITY];
		topOfStack = -1;
	}

	public boolean isEmpty() {
		return topOfStack == -1;
	}

	public void makeEmpty() {
		topOfStack = -1;
	}

	public Object top() {
		if (isEmpty()) {
			System.out
					.println("StackDS.java: The stack is empty for a top action");
		}
		return theArray[topOfStack];
	}

	public void pop() {
		if (isEmpty()) {
			System.out
					.println("StackDS.java: The stack is empty for a pop action");
		}
		topOfStack--;
	}

	public Object topAndPop() {
		if (isEmpty()) {
			System.out
					.println("StackDS.java: The stack is empty for a topandpop action");
		}
		return theArray[topOfStack--];
	}

	public void push(Object x) {
		if (topOfStack + 1 == theArray.length) {
			System.out.println("StackDS.java: The stack is full - Error");
		}
		theArray[++topOfStack] = x;
	}
}
