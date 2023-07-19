package july19;

public class Stack<T> implements GenDemo<T> {
	
	private int[] arr;
	private int size;
	private int ptr;
	
	
	public Stack () {
		this.arr = new int[5];
		this.size = 5;
		this.ptr = -1;
	}
	
	public Stack(int[] arr) {
		this.arr = arr;
		this.size = arr.length;
	}
	
	public Stack(int[] arr, int size) {
		this.arr = arr;
		this.size = size;
		this.ptr = -1;
	}
	
	public void push (int num) {
		if (ptr<size) {
			ptr = ptr + 1;
			arr[ptr] = num;
		} else {
			throw new RuntimeException("Stack OverFlow");
		}
	}
	
	public int pop() {
		int val = 0;
		if (ptr == -1) {
			throw new RuntimeException("Stack UnderFlow");
		} else {
			val = arr[ptr];
			ptr = ptr - 1;
		}
		return val;
	}
	
	@Override
	public void addFirst(T data) {}

	@Override
	public void append(T data) {}

	@Override
	public boolean searchElement(T data) {
		return false;
	}

}
