package bls;

public class MainTree {

	public static void main(String[] args) {
		
		MyTree mt = new MyTree();
		
		mt.add(6);
		mt.add(7);
		mt.add(4);
		mt.add(9);
		mt.add(2);
		mt.add(11);
		mt.add(3);
		mt.add(10);
		
		System.out.println("Inorder");
		mt.inorder(mt.root);
		System.out.println();
		System.out.println("Preorder");
		mt.preorder(mt.root);
		System.out.println();
		System.out.println("PostOrder");
		mt.postOrder(mt.root);
		
	}
}
