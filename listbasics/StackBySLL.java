package listbasics;

import listbasics.SinglyLinkedList.Node;

public class StackBySLL {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	Node top;
	int size;
	
	void push(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
		size++;
		
	}
	
	int pop() {
		if(top == null) {
			System.out.println("no element in stack !!!");
			return 0;
		}
		int data = top.data;
		top = top.next;
		size--;
		return data;
	}
	
	@Override
	public String toString() {
		
		Node temp = top;
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
	

}
