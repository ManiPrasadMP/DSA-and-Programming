package listbasics;

public class StackTest {
	
	public static void main(String[] args) {
		
		StackBySLL st = new StackBySLL();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.size);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.size);
	}

}
