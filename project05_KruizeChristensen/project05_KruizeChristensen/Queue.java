package project05_KruizeChristensen;

/**
 * The Queue class represents a last-in-first-out (FIFO) stack of objects. 
 * This is for our 132 class to learn about Queues. 
 * It is similar to (but different from) java.util.Queue
 *
 * @param <E>
 */

public interface Queue<E> {
	
	/**
	 * Returns the number of items in the queue
	 * @return number of elements in the queue
	 */
	int size();
	
	/**
	 * Returns true if the stack is empty, otherwise false
	 * @return true if empty, else false
	 */
	boolean isEmpty();
	
	/**
	 * Adds an element to the back of the queue
	 * @param e the element to be added to the queue
	 */	
	void enqueue(E e);
	
	/**
	 * Returns the top element of the queue but doesn't remove it
	 * Comparable to the peek() method in java.util.Queue
	 * @return the top element of the stack
	 */
	E first();
	
	/**
	 * Removes the front element of the queue and returns the element.
	 * @return the front element of the queue
	 */
	E dequeue();

}
