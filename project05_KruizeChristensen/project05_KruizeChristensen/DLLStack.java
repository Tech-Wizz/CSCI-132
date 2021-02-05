package project05_KruizeChristensen;

public class DLLStack<E> implements Stack<E> {
	private DoublyLinkedList<E> list = new DoublyLinkedList<>(); 
	public DLLStack() {}
	public int size() { return list.size(); }                           //returns size
	public boolean isEmpty() { return list.isEmpty(); }                 //reads if no values are there
	public void push(E element) { list.addFirst(element); }             //adds one to the stack
	public E peek() { return list.first(); }                            //returns the first
	public E pop() { return list.removeFirst(); }                       //takes away the first
	public String toString() { return list.toString(); }                //makes it so it prints out
}

