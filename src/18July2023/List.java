package assignment;

public class List {
	Node head = null;
	Node tail = null;
	int size = -1;
	public void addElement(int data) {
		Node node = new Node(data);
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
	
	public void addAtStart(int data) {
		Node temp = null;
		Node node = new Node(data);
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
	
	public void addAtLast(int data) {
		Node node = new Node(data);
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
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
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
			Node temp = head;
			while (temp.next.next!=null) {
				temp = temp.next;
			}
			tail = temp.next;
			tail.next = null;
			temp.next = null;
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
				Node temp = head;
				Node temp2 = head.next;
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

class Node {
	int data;
	Node next;
	
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
	
}
