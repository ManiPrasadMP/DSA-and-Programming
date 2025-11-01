package data_structure.com.list;

public class StackClass<T> {
	public Node<T> top;
	int size;

	void push(T data) {
		Link

	}

	T pop() {
		if (top == null) {
			System.out.println("no element in stack !!!");
			return null;
		}
		T data = top.data;
		top = top.next;
		size--;
		return data;
	}

	@Override
	public String toString() {

		Node<T> temp = top;
		StringBuilder sb = new StringBuilder();
		while (temp != null) {
			sb.append(temp.data);
			if (temp.next != null) {
				sb.append("->");
			}
			temp = temp.next;
		}

		return sb.toString();
	}

}
