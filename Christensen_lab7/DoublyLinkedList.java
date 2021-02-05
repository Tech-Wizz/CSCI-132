package christensen_lab7;

public class DoublyLinkedList<E>  {
	private static class Node<E> {
		// Node Fields
		private E element;
		private Node<E> prev;
		private Node<E> next;
		
		// Node Constructor
		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
		}
		
		// Node Methods
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
	
	// DLinkedList Fields
	private Node<E> header;
	private Node<E> trailer;
	int size;
	
	// DLinkedList Constructor
	public DoublyLinkedList() { 
		this.header = new Node<>(null, null, null);
		this.trailer = new Node<>(null, this.header, null);
		this.header.setNext(this.trailer);
	}
	
	// DLinkedList Methods
	public int size() {
		return this.size;
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
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
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
	public void add(int index, E element) {
		Node<E> walk = this.header;
		for (int i = 0; i< index; i++) {
			walk = walk.getNext();
		}
		addBetween(element, walk,  walk.getNext());
	}
	public void add(E e) {
//		this.size++;
//		addLast(e);
		addBetween(e, this.trailer.getPrev(), this.trailer);
	}
	public void clear() {
		while (size > 0) {
			removeLast();
		}
		isEmpty();
	}
	public E get(int index) {
		Node<E> walk = header;
		int i = 0 ;
		for (i = 0; i< index; i++) {
			walk = walk.getNext();
		}
		return walk.element;
	}
	public E set(int index, E element) {
		Node<E> n = this.header;
		for (int i = 0; i < index;i++) {
			n = n.getNext();
		}
		E walk = n.element;
		n.element = element;
		return walk;
	}
//	private Node<E> getNode(int index){
//		if(index == 0) {
//			return this.header;
//		}else if (index == this.size) {
//			return this.trailer;
//		}
//		Node<E> current = header;
//		while(index != 0) {
//			current = current.next;
//			index = index -1;
//		}
//		return current;
//	}
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
