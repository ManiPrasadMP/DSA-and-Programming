package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalanceBrackets {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		boolean rs = isBalance(str);
		if(rs) {
			System.out.println("String Balanced ");
		}
		else
			System.out.println("String is not balanced");
		
		
	}

	private static boolean isBalance(String str) {
		if(str.length()%2==1)
			return false;
		
		Stack<Character> st = new Stack<Character>();
		
		for(Character ch : str.toCharArray()) {
			if(ch=='{'||ch=='('||ch=='[') {
				st.push(ch);
			}
			else {
				if(st.empty())
					return false;
				Character pch = st.pop();
				
				if(pch=='{'&&ch!='}'||pch=='['&&ch!=']'||pch=='('&&ch!=')') {
					return false;
				}
			}
		}
		return st.empty();
	}

}
