package DataStructure;

public class UnorderedList<T> {

	private Node<T> head;
	public void list() {
		head = null;
	}
	public void add(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			return;
		}

		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
	}
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void remove(T item) {
		Node<T> n = head;
		Node<T> prev = null;
		if (head.data.equals(item)) {
			head = head.next;
			return;
		}
		while (!n.data.equals(item)) {
			prev = n;
			n = n.next;
		}
		n = n.next;
		prev.next = n;

	}

	public boolean search(T item) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.data.equals(item)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public int size() {
		int count = 0;
		Node<T> temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	public int index(T item) {
		int index = 0;
		Node<T> temp = head;
		while (temp != null) {
			if (item.equals(temp.data)) {
				return index;
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}
	public void insertAt(int pos, T item) {
		if (pos > size()) {
			System.out.println("out of position");
			return;
		}
		Node<T> node = new Node<T>(item);
		if (pos == 0) {
			node.next = head;
			head = node;
			return;
		}
		Node<T> temp = head;

		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
	}
	public T pop() {
		T data = null;
		if (head.next == null) {

			data = (T) head.data;
			head = null;
			return data;
		}
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		data = (T) temp.data;
		prev.next = null;
		return data;
	}
	public T pop(int pos) {
		int index = 0;
		Node<T> n = head;
		if (pos == 0) {
			head = head.next;

			return (T) n.data;
		}
		Node<T> prev = null;
		while (index != pos) {
			prev = n;
			n = n.next;
			index++;
		}
		prev.next = n.next;

		return (T) n.data;
	}
	public T get(int index) {
		Node<T> temp = head;
		Node<T> prev = null;

		for (int i = 0; i <= index; i++) {
			prev = temp;
			temp = temp.next;
		}
		return (T) prev.data;
	}
	public void disp() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}


