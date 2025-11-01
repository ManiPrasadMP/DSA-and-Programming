package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String sentence = sc.nextLine();
		
//		System.out.println(usingReverse(sentence));
		System.out.println(usingCustom(sentence));
	}

	private static String usingCustom(String st) {
		
		char[] rs = st.toCharArray();
		for(int i = 0;i<st.length();i++) {
			int j = i;
			
			while(j!=st.length() && st.charAt(j)!=' ' )
				j++;
			int k = j;
			j = j-1;
			while(i<j) {
				char temp = rs[i];
				rs[i] = rs[j];
				rs[j] = temp;
				i++;
				j--;
			}
			i = k;
		}
		return new String(rs);
	}

	private static String usingReverse(String sentence) {
		
		StringBuilder sb = new StringBuilder(sentence);
		sb.reverse();
		String[] words = sb.toString().split(" ");
		sentence = "";
		for(int i =words.length-1;i>0;i--)
		sentence =sentence + words[i]+" ";
		
		sentence =sentence + words[0];
		
		return sentence;
	}
	
	
}
