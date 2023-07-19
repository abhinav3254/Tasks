package july19;


public class Main {
	public static void main(String[] args) {
		
		// Note : indexing start from 0
		List<String> list = new List<String>();
		list.addElement("10");
		list.addElement("20");
		list.addElement("30");
		list.addElement("40");
		list.addAtStart("101");
		list.addAtLast("202");
		list.printAll();
		System.out.println("__________");
		list.deleteAtStart();
		list.printAll();
		list.deleteAtEnd();
		list.deleteAt(2);
		System.out.println("__________");
		list.printAll();
		System.out.println("__________");
		list.deleteAt(2);
		System.out.println("Delete at inde x2");
		list.printAll();
	}
}