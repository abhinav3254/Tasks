package july19;

public class List<T> {
	Node<T> head = null;
	Node<T> tail = null;
	int size = -1;
	public void addElement(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = node;
			tail = tail.next;
		}
		size = size+1;
	}
	
	public void addAtStart(T data) {
		Node<T> temp = null;
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			temp = head;
			head = node;
			head.next = temp;
		}
		size = size + 1;
	}
	
	public void addAtLast(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			while (tail.next!=null) {
				tail = tail.next;
			}
			tail.next = node;
			tail = tail.next;
		}
		size = size + 1;
	}
	
	public void printAll () {
		if (head == null) {
			System.out.println("Cannot Print Empty List");
		} else {
			Node<T> temp = head;
			while(temp != null) {
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}
			System.out.println(" null ");
		}
	}
	
	public void deleteAtStart() {
		if (head == null) {
			System.out.println("Cannot delete anything from Empty List");
		} else {
			head = head.next;
			size = size-1;
		}
	}
	
	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("Cannot delete anything from Empty List");
		} else {
			Node<T> temp = head;
			while (temp.next!=tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			size = size - 1;
		}
	}
	
	public void deleteAt(int index) {
		if (head == null) {
			System.out.println("Empty List");
		}else {

			if (size < 0) {
				System.out.println("Empty List");
				return;
			} else if (index >= size) {
				System.out.println("Wrong index");
				return;
			} else if (index == size - 1) {
				deleteAtEnd();
				return;
			} else if (index == 0) {
				deleteAtStart();
				return;
			}else{
				Node<T> temp = head;
				Node<T> temp2 = head.next;
				int i = 0;
				while (++i < index) {
					temp = temp2;
					temp2 = temp2.next;
				}
				temp.next = temp2.next;
				size = size - 1;
				return;
			}
		
		}
	}
}

class Node<T> {
	T data;
	Node<T> next;
	
	public Node (T data) {
		this.data = data;
		this.next = null;
	}
	
}