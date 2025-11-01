package bls;

public class MyTree {

	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	Node root;
	
	void add(int data) {
		Node n = new Node(data);
		if(root == null) {
			root = n;
		}
		else {
			Node temp = root;
			Node head = root;
			while(temp!=null) {
				if(data > temp.data) {
					head = temp;
					temp =  temp.right;
					
				}
				else {
					head = temp;
					temp =  temp.left;
				}
			}
			if(head.data>data) {
				head.left = n;
			}
			else{
				head.right = n;
			}
		}
	}
	
	
	
	
	public void inorder(Node rt) {
		if(rt==null)
			return;
		inorder(rt.left);
		System.out.print(rt.data+" ");
		inorder(rt.right);
		
	}
	public void preorder(Node rt) {
		if(rt==null)
			return;
		System.out.print(rt.data+" ");
		inorder(rt.left);
		inorder(rt.right);
		
	}
	public void postOrder(Node rt) {
		if(rt==null)
			return;
		inorder(rt.left);
		inorder(rt.right);
		System.out.print(rt.data+" ");
		
	}
}
