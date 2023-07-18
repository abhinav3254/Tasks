package assignment;

public class Main {
	public static void main(String[] args) {
		List list = new List();
//		list.addElement(10);
//		list.addElement(20);
//		list.addElement(30);
//		list.addElement(40);
//		list.addAtStart(101);
//		list.addAtLast(202);
		list.printAll();
		System.out.println("__________");
		//list.deleteAtStart();
		//list.printAll();
		//list.deleteAtEnd();
		list.deleteAt(2);
		System.out.println("__________");
		list.printAll();
	}
}
