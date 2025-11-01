package data_structure.com.list;

public class LinkedListBaseClass<T extends Comparable<T>> {
	
	Node<T> head;
	int size;
	
	void add(T data) {
		Node<T> n = new Node<T>(data);
		size++;
		if(head==null) {
			head = n;
		}
		else {
			Node<T> temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next=n;

		}
	}
	
	void addFirst(T data) {
		Node<T> n = new Node<T>(data);
		n.next=head;
		head = n;
	}
	
	public T deleteFirst() {
		if(head==null) {
			System.out.println("list is empty");
			return null;
		}
		T data = head.data;
		head = head.next;
		
		return data;
	}
	
	boolean searchElementIndex(T ele) {
		if(head==null) {
			System.out.println("no element in list");
			return false;
		}
		int index = 0;
		Node<T> temp=head;
		while(temp!=null) {
			if(temp.data==ele) {
				System.out.println("index of given element : "+index);
				return true;
			}
			index++;
			temp=temp.next;
		}
		return false;
	}
	
	public void reverse() {
		if(head==null) {
			System.out.println("no list present");
			return;
		}

		Node<T> prev=null;
		Node<T> cur=head;
		Node<T> next = null;
		while(cur!=null) {
			next = cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head=prev;
	}
	
	boolean isCyclic() {
		if(head==null) {
			return false;
		}
		Node<T> fast=head;
		Node<T> slow=head;
		
		while(fast!=null&&fast.next!=null) {
			slow = slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		
		Node<T> temp = head;
		StringBuilder sb = new StringBuilder("{");
		while(temp!=null) {
			sb.append(temp.data);
			if(temp.next!=null){
				sb.append("->");
			}
			temp=temp.next;
		}
		sb.append("}");
		return sb.toString();
	}
	
	public LinkedListBaseClass<T>  mergeTwoList(LinkedListBaseClass<T> list1,LinkedListBaseClass<T> list2){
		Node<T> temp1 = list1.head;
		Node<T> temp2 = list2.head;
		if(temp1==null) {
			return list2;
		}
		if(temp2==null) {
			return list1;
		}
		
		LinkedListBaseClass<T> list = new LinkedListBaseClass<T>();
		if(temp1.data.compareTo(temp2.data)>0) {
			list.add(temp2.data);
			temp2 = temp2.next;
		}
		else {
			list.add(temp1.data);
			temp1 = temp1.next;
		}
		while(temp1!=null && temp2 != null) {
			if(temp1.data.compareTo(temp2.data)>0) {
				list.add(temp2.data);
				temp2 = temp2.next;
			}
			else {
				list.add(temp1.data);
				temp1 = temp1.next;
			}
		}
		while(temp1!=null) {
			list.add(temp1.data);
			temp1 = temp1.next;
		}
		while(temp2!=null) {
			list.add(temp2.data);
			temp2 = temp2.next;
		}
		return list;
	}
	
	public int getSize() {
		return size;
	}
	
	public LinkedListBaseClass<T>  mergeSort(LinkedListBaseClass<T> list){
		
		if(list.getSize()<2)
			return list;
		
		int middle = list.getSize()/2;
		LinkedListBaseClass<T> leftside = new LinkedListBaseClass<T>();
		LinkedListBaseClass<T> rightside = new LinkedListBaseClass<T>();
		
		int locator = 0;
		Node<T> temp = list.head;
		while(locator<middle) {
			leftside.add(temp.data);
			temp = temp.next;
			locator++;
		}
		while(locator < list.getSize()) {
			rightside.add(temp.data);
			temp = temp.next;
			locator++;
		}
//		System.out.println("Current middle : "+locator);
//		System.out.println(leftside);
//		System.out.println(rightside);
		leftside = mergeSort(leftside);
		rightside = mergeSort(rightside);
		list = mergeTwoList(leftside, rightside);
		return list;
	}
	
}
