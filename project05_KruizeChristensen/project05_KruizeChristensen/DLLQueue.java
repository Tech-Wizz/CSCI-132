package project05_KruizeChristensen;

public class DLLQueue<E> implements Queue<E> { //the same as DLLStack but implements queue commands
	private DoublyLinkedList<E> list = new DoublyLinkedList<>(); 
	public DLLQueue() {}
	public int size() { return list.size(); }                         //returns size
	public boolean isEmpty() { return list.isEmpty(); }               //reads if no values are there
	public void enqueue(E element) { list.addLast(element); }         //adds one to the stack
	public E first() { return list.first(); }                         //returns the first
	public E dequeue() { return list.removeFirst(); }                 //takes away the first
	public String toString() { return list.toString(); }              //makes it so it prints out
}
