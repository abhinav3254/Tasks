package july19;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		StringStack stringStack = new StringStack();
		stringStack.push("Abhinav");
		stringStack.push("Kushi");
		stringStack.push("AAKASH");
		stringStack.push("Ashish");
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		
	}
}
