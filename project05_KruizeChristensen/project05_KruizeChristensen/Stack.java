package project05_KruizeChristensen;

/**
 * The Stack class represents a last-in-first-out (LIFO) stack of objects. 
 * This is for our 132 class to learn about Stacks. 
 * It is similar to (but different from) java.util.Stack
 *
 * @param <E>
 */

public interface Stack<E> {
	
	/**
	 * Returns the number of items in the stack
	 * @return number of elements in the stack
	 */
	int size();

	/**
	 * Returns true if the stack is empty, otherwise false
	 * @return true if empty, else false
	 */
	boolean isEmpty();
	
	/**
	 * Adds an element to the top of the stack
	 * @param e the element to be added to the stack
	 */	
	void push(E e);
	
	/**
	 * Returns the top element of the stack but doesn't pop it off.
	 * @return the top element of the stack
	 */
	E peek();
	
	/**
	 * Pops the top element of the stack and returns the element.
	 * @return the top element of the stack
	 */
	E pop();

}

