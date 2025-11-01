package listbasics;

public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
	void add(int data) {
		Node n = new Node(data);
		
		if(head==null) {
			head = n;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next=n;

		}
	}
	
	void makeCyclic() {
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=head;
	}
	
	void addFirst(int data) {
		Node n = new Node(data);
		n.next=head;
		head = n;
	}
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null){
				System.out.print("->");
			}
			else
				System.out.println();
			temp=temp.next;
		}
	}
	@Override
	public String toString() {
		
		Node temp = head;
		StringBuilder sb = new StringBuilder();
		while(temp!=null) {
			sb.append(temp.data);
			if(temp.next!=null){
				sb.append("->");
			}
			temp=temp.next;
		}
		
		return sb.toString();
		}
	
	public void printforwd() {
		printfd(head);
		System.out.println();
	}
	private void printfd(Node start) {
		if(start == null) {
			return;
		}
		System.out.print(start.data+" ");
		printfd(start.next);
	}
	
	public void printBack() {
		if(head== null) {
			return;
		}
		printbk(head);
		System.out.println();
	}
	private void printbk(Node start) {
		if(start.next != null) {
			printbk(start.next);
		}
		System.out.print(start.data+" ");
	}
	
	public int sumOfData() {
		return sums(head);
	}
	
	private int sums(Node start) {
		if(start==null)
			return 0;
		return start.data+sums(start.next);
	}
	public int prodOfData() {
		return prod(head);
	}
	
	private int prod(Node start) {
		if(start==null)
			return 0;
		return start.data*sums(start.next);
	}

	public int deleteFirst() {
		if(head==null) {
			System.out.println("list is empty");
			return 0;
		}
		int data = head.data;
		head = head.next;
		
		return data;
	}

	public int deleteLast() {
		if(head==null) {
			System.out.println("no list present");
			return 0;
		}
		Node temp = head;
		Node prev= null;
		while(temp.next!=null) {
			prev=temp;
			temp= temp.next;
		}
		if(prev!=null)
		prev.next=null;
		else
			head=null;
		return temp.data;
	}
	
	void insertBetween(int value,int pos) {
		int i = 0;
		if(head==null) {
			System.out.println("no element found");
			return;
		}
		if(pos==0) {
			this.addFirst(value);
			return;
		}
		Node temp = head;
		Node prev = null;
		while(pos>1&&temp!=null) {
			
			pos--;
			temp = temp.next;
		}
		if(temp==null) {
			System.out.println("index not in the range!!!");
			return;
		}
		Node n = new Node(value);
		n.next=temp.next;
		temp.next=n;
	}
	
	int deleteBetween(int pos) {
		if(head == null) {
			System.out.println("list is empty");
			return 0;
		}
		Node temp = head;
		Node prev=null;
		if(pos==1) {
			return this.deleteFirst();
		}
		while(pos>0&&temp!=null) {
			prev=temp;
			temp=temp.next;
			pos--;
		}
		if(temp==null) {
			System.out.println("invalid position");
			return 0;
		}
		if(temp.next==null) {
			
			return this.deleteLast();
		}
		prev.next=temp.next;
		return temp.data;
	}
	
	boolean searchElement(int ele) {
		if(head==null) {
			System.out.println("no element in list");
			return false;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==ele) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	boolean searchRec(int data) {
		System.out.println("index of found element is : "+getIndex(data,head,0));
		return searchRec(data,head);
		
	}

	private int getIndex(int data, Node start, int i) {
		if(start==null)
			return -1;
			if(start.data==data)
				return i;
			return getIndex(data,start.next,i+1);
		
	}

	private boolean searchRec(int data, Node start) {
		if(start==null)
		return false;
		if(start.data==data)
			return true;
		return searchRec(data,start.next);
	}
	public int getCount(int data) {
		return getCount(data,head,0);
	}
	private int getCount(int data, Node start, int c) {
		if(start==null)
			return 99;
			if(start.data==data)
				return c++;
			return getIndex(data,start.next,c);
		
	}
	
	public void reverse() {
		if(head==null) {
			System.out.println("no list present");
			return;
		}

		Node prev=null;
		Node cur=head;
		Node next = null;
		while(cur!=null) {
			next = cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head=prev;
	}
	
	boolean isCircular() {
		if(head==null) {
			return false;
		}
		Node temp = head.next;
		while(temp!=null&&temp!=head) {
			temp = temp.next;
		}
		return temp==head;
	}
	
	boolean isCyclic() {
		if(head==null) {
			return false;
		}
		Node fast=head;
		Node slow=head;
		
		while(fast!=null&&fast.next!=null) {
			slow = slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	int size() {
		if(head==null) {
			return 0;
		}
		return size(head);
	}

	private int size(Node start) {
		if(start==null)
		return 0;
		return size(start.next)+1;
	}
	
}
