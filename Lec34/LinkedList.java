package Lec34;
public class LinkedList<T> {
	class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

//O(1)
	public void AddLast(T item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

//O(N)
	public void Addat_index(T item, int k) throws Exception {
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = GetNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}

	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k range me nhi h");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(1)
	public T getFirst() {
		return head.val;
	}

	// O(1)
	public T getLast() {
		return tail.val;
	}

	// O(N)
	public T get_at_index(int k) throws Exception {
		return GetNode(k).val;
	}

	public T removeFirst() {
		T val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {

		}
		return val;
	}

	public T removeLast() throws Exception {

		if (size == 1) {
			return removeFirst();

		} else {
			T val = tail.val;
			Node sl = GetNode(size - 2);
			tail = sl;
			tail.next = null;
			size--;
			return val;
		}

	}

	public T remove_at_index(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = GetNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}
}
