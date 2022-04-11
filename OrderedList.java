package DataStructure;

public class OrderedList<T extends Comparable<T>> {
	
		Node<T> head;
		Node<T> tail;
		public OrderedList() {
			head = null;
		}
		public void add(T data) {
			Node<T> n = head;
			Node<T> temp = new Node<T>(data);
			if (head == null) {
				head = temp;
				head.next = tail;
				tail = head;
			} else if (data.compareTo((T) head.data) < 0) {
				temp.next = head;
				head = temp;
			} else {
				if (data.compareTo((T) tail.data) > 0) {
					tail.next = temp;
					tail = temp;
					return;
				}
				Node<T> prev = null;
				while (data.compareTo((T) n.data) > 0 && n.next != null) {
					prev = n;
					n = n.next;
				}
				prev.next = temp;
				temp.next = n;
			}
		}
		public void remove(T item) {
			Node<T> n = head;
			Node<T> prev = null;
			if (head.data.equals(item)) {
				head = head.next;
				return;
			} else if (tail.data.equals(item)) {
				while (!n.next.data.equals(tail.data)) {
					n = n.next;
				}
				n.next = null;
				tail = n;
				return;
			} else {
				while (!n.data.equals(item)) {
					prev = n;
					n = n.next;
				}
				n = n.next;
				prev.next = n;
				n = null;

			}
		}
		public void disp() {
			Node<T> temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;

			}
		}
		public boolean search(T item) {
			Node<T> n = head;
			if (head.data.equals(item)) {
				return true;
			}
			while (n != null) {
				if (n.data.equals(item)) {
					return true;
				}
				n = n.next;
			}
			return false;
		}
		public int size() {
			if (head == null) {
				return 0;
			}
			Node<T> temp = head;
			int count = 0;
			while (temp.next != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		public boolean isEmpty() {
			if (head == null) {
				return true;
			}
			return false;
		}
		public int index(T item) {
			int index = 0;
			Node<T> n = head;
			while (!n.data.equals(item)) {
				n = n.next;
				index++;
			}
			return index;

		}

		public T pop() {
			Node<T> n = head;
			Node<T> prev = null;
			while (n.next != null) {
				prev = n;
				n = n.next;
			}
			prev.next = null;
			tail = prev;
			return (T) n.data;
		}
		public T pop(int pos) {
			int index = 0;
			Node<T> prev = null;
			Node<T> n = head;
			if (head == null) {
				return null;
			}
			if (pos == 0) {
				head = head.next;
				return (T) n.data;
			} else {
				while (index != pos) {
					prev = n;
					n = n.next;
					index++;
				}
				prev.next = n.next;

				return (T) n.data;
			}
		}

	}

