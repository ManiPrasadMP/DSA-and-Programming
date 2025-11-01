package listbasics;

public class DLLTest {

	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.add(10);
		dl.add(20);
		dl.add(33);
		dl.add(44);
		dl.add(60);
		
//		System.out.println("List is : "+dl);
//		
//		System.out.println("List size : "+dl.size);
		
		dl.addfirst(9);
		dl.addfirst(7);
		dl.addfirst(5);
		dl.addfirst(3);
//		dl.printPrev();
		System.out.println("List is : "+dl);
		
		System.out.println("List size : "+dl.size);
		
//		System.out.println("First element deleted is : "+dl.deleteFirst());
//		System.out.println("List is : "+dl);
//		
//		System.out.println("Last element deleted is : "+dl.deleteLast());
//		System.out.println("List is : "+dl);
		
		dl.insertAtIndex(9, 987);
		
		System.out.println("List is : "+dl);
		
		System.out.println("List size : "+dl.size);
		
//		DoublyLinkedList dl2 = new DoublyLinkedList();
//		
//		dl2.insertAtIndex(2, 12);
//		System.out.println(dl2);
//		System.out.println("deleted element is ----------------------------:"+dl.deleteAtIndex(8));
//		System.out.println(dl);
		
//		System.out.println("deleted element is :"+dl2.deleteAtIndex(2));
//		System.out.println(dl2);
		
		dl.reverse();
		System.out.println(dl);
	}
}
