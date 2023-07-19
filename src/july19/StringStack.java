package july19;

public class StringStack implements GenDemo<String> {
	
	
	private String[] arr;
	private int size;
	private int ptr;
	
	
	public StringStack () {
		this.arr = new String[5];
		this.size = 5;
		this.ptr = -1;
	}
	
	public StringStack(String[] arr) {
		this.arr = arr;
		this.size = arr.length;
	}
	
	public StringStack(String[] arr, int size) {
		this.arr = arr;
		this.size = size;
		this.ptr = -1;
	}
	
	public void push (String num) {
		if (ptr<size) {
			ptr = ptr + 1;
			arr[ptr] = num;
		} else {
			throw new RuntimeException("Stack OverFlow");
		}
	}
	
	public String pop() {
		String val = "";
		if (ptr == -1) {
			throw new RuntimeException("Stack UnderFlow");
		} else {
			val = arr[ptr];
			ptr = ptr - 1;
		}
		return val;
	}

	@Override
	public void addFirst(String data) {}

	@Override
	public void append(String data) {}

	@Override
	public boolean searchElement(String data) {
		return false;
	}

}
