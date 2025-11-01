package listbasics;

public class DoublyLinkedList {
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	int size;
	void add(int data) {
		Node n = new Node(data);
		size++;
		
		if(head==null) {
			head = n;
//			size++;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=n;
		n.prev=temp;
	}
	
	void addfirst(int data) {
		size++;
		Node n = new Node(data);
		n.next=head;
		head.prev=n;
		head=n;
	}

	
	int deleteFirst() {
		if(head==null) {
			System.out.println("list is empty");
			return 0;
		}
		size--;
		int data = head.data;
		head = head.next;
		head.prev = null;
		return data;
	}
	
	int deleteLast() {
		if(head==null) {
			System.out.println("list is empty");
			return 0;
		}
		size--;
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		if(temp.prev!=null) {
			temp.prev.next = null;
		}
		else
			head = null;
		return temp.data;
	}
	
	void insertAtIndex(int in,int ele) {
		if(head==null) {
			this.add(ele);
			return;
		}
		if(in==0) {
			this.addfirst(ele);
			return;
		}
		
		Node temp = head;
		while(in>1  &&temp!=null) {
			in--;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("index not in range ");
			return;
		}
		size++;
		Node n = new Node(ele);
		n.next = temp.next;
		if(temp.next!=null)
			temp.next.prev=n;
		temp.next = n;
		n.prev = temp;
		
	}
	
	
	int deleteAtIndex(int in) {
		if(in==0) {
			return deleteFirst();
		}
		if(head==null) {
			System.out.println("No item in list");
			return 0;
		}
		Node temp = head;
		while(in>0&&temp!=null) {
			in--;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("index not in the range !!!");
			return 0;
		}
		if(temp.next==null) {
			return this.deleteLast();
		}
		size--;
		temp.prev.next=temp.next;
		temp.next.prev = temp.prev;
		return temp.data;
	}
	
	void reverse() {
		
		Node t = head;
		Node cur = null;
		while(t!=null) {
			cur = t.next;
			t.next = t.prev;
			t.prev = cur;
			if(cur!=null)
				t = cur;
			else
				break;
		}
		head=t;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if(head == null) {
			System.out.println("list is empty");
			return sb.toString();
		}
		
		Node temp = head;
		while(temp!=null) {
			if(temp.next!=null)
				sb.append(temp.data+"<->");
			else
				sb.append(temp.data);
			temp = temp.next;
		} 
		
		return sb.toString();
	}
	
	void printPrev() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node temp = head.next;
		while(temp!=null) {
			System.out.println("prev of "+temp.data+" is "+temp.prev.data);
			temp = temp.next;
		}
		
	}
	
	
}
