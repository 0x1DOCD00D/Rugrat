package ragDB.query.Memory;

/**
 * @author Arthi
 * Stack DS Methods
 */
public interface Stack {

	void push(Object x);
	void pop();
	Object top();
	Object topAndPop();
	boolean isEmpty();
	void makeEmpty();
}
