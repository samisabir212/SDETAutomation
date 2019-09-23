package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
//		mylist.insertFirst(100);
//		mylist.insertFirst(50);
//		mylist.deleteFirst();
//		mylist.insertFirst(99);
//		mylist.insertLast(200);
		boolean truth = mylist.isEmpty();
		System.out.println(truth);
//		mylist.insertFirst(88);
//		mylist.insertLast(9999999);
//		
		mylist.displayList();
	}

}
