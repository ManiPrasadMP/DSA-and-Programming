package data_structure.com.list;
public class ListMainClass {

	public static void main(String[] args) {
		LinkedListBaseClass<Integer> list1 = new  LinkedListBaseClass<Integer>();
		list1.add(51);
		list1.add(93);
		list1.add(7);
		list1.add(19);
		System.out.println("Before sorting : ");
		System.out.println(list1);
		list1 = list1.mergeSort(list1);
		System.out.println("After sorting :");
		System.out.println(list1);

		System.out.println("this list is cyclic : "+list1.isCyclic());
		
		System.out.println(list1.searchElementIndex(7)?"found":"not found");
		
		LinkedListBaseClass<Integer> list2 = new  LinkedListBaseClass<Integer>();
		list2.add(25);
		list2.add(49);
		list2.add(6);
		list2.add(11);
		list2.add(3);
		System.out.println("Before sorting : ");
		System.out.println(list1);
		list1 = list1.mergeSort(list1);
		System.out.println("After sorting :");
		System.out.println(list1);
		
		LinkedListBaseClass<Integer> merge = list1.mergeTwoList(list1,list2);
		System.out.println("merged  list : ");
		System.out.println(merge);
		
		
	}

}
