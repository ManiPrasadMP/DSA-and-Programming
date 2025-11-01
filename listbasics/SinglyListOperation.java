package listbasics;

public class SinglyListOperation {
	
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.add(25);
		sl.add(35);
		sl.add(45);
		sl.add(55);
		
//		sl.display();
//		System.out.println(sl);
		
//		sl.printforwd();
////		System.out.println();
//		sl.printBack();
//		
//		System.out.println("Sum is :"+sl.sumOfData());
//		
//		System.out.println("product is :"+sl.prodOfData());
//		
		System.out.println("**************________________********************");
		SinglyLinkedList sl2 = new SinglyLinkedList();
		sl2.addFirst(125);
		sl2.addFirst(335);
		sl2.addFirst(405);
		sl2.addFirst(5895);
		
//		System.out.println(sl2);
//		
//		sl2.printBack();
//		
//		int data = sl2.deleteFirst();
//		
//		System.out.println("deleted element is : "+data);
//		System.out.println(sl2);
//		
//		int d = sl.deleteLast();
//		System.out.println("last node deleted is :"+d);
//		
//		System.out.println(sl2);
//		
//		sl2.insertBetween(56700, 4);
//		 
//		System.out.println(sl2);
//		System.out.println(sl2.deleteBetween(3));
//		System.out.println(sl2);
		
//		boolean rs = sl2.searchElement(55);
//		if(rs) {
//			System.out.println("element found");
//		}
//		else
//			System.out.println("Element not found");
//		boolean rs2 = sl2.searchRec(405);
//		if(rs2) {
//			System.out.println("element found");
//		}
//		else
//			System.out.println("Element not found");
		
//		sl2.reverse();
//		System.out.println(sl2);
		System.out.println(sl);
		System.out.println("hiii");
//		sl.makeCyclic();
		System.out.println(sl.isCircular());
		System.out.println("Size of list is :"+sl.size());
		
	}

}
