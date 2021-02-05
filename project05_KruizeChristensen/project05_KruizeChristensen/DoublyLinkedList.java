package project05_KruizeChristensen;

public class DoublyLinkedList<E> {
	
	private static class Node <E> {
		// Fields
		E element;
		Node<E> prev;
		Node<E> next;
		
		// Constructor
		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
		}
		
		// Methods
		public E getElement() {
			return element;
		}
		public Node<E> getPrev() {
			return this.prev;
		}
		public Node<E> getNext() {
			return this.next;
		}
		public void setPrev(Node<E> p) {
			this.prev = p;
		}
		public void setNext(Node<E> n) {
			this.next = n;
		}

	}
	
	// Fields
	private Node<E> header;
	private Node<E> trailer;
	int size;
	
	// Constructor
	public DoublyLinkedList() { 
		this.header = new Node<>(null, null, null);
		this.trailer = new Node<>(null, this.header, null);
		this.header.setNext(this.trailer);;
	}
	
	// Methods
	public int size() {
		return size;
	}
	public E first() {
		if (isEmpty()) {
			return null;
		}
		return this.header.next.getElement();
	}
	public E last () {
		if (isEmpty()) {
			return null;
		}
		return this.trailer.prev.getElement();
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void addFirst (E e) {
		addBetween(e, this.header, this.header.getNext());
	}
	public void addLast (E e) {
		addBetween(e, this.trailer.getPrev(), this.trailer);
	}
	public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		this.size++;
	}
	public E removeFirst() {
		if (this.isEmpty()) {
			return null;
		}
		return this.remove(header.getNext());
	}
	public E removeLast() {
		if (this.isEmpty()) {
			return null;
		}
		return this.remove(trailer.getPrev());
	}
	public E remove(Node<E> e) {
		e.next.setPrev(e.prev);
		e.prev.setNext(e.next);
		this.size--;
		return e.getElement();
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = this.header.next;
		while (walk != this.trailer) {
			sb.append(walk.element);
			if (walk.next != this.trailer)
				sb.append(", ");
			walk = walk.next;
		}
		sb.append(")");
		return sb.toString();
	}

}

