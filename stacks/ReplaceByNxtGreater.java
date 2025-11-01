package stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReplaceByNxtGreater {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
//		arr = nextGreater(arr);
		arr = nextGreater2(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] nextGreater(int[] arr) {
		int res[] = new int[arr.length];
		
		for(int i =0;i<arr.length;i++) {
			int j =i+1;
			
			while(j<arr.length) {
				if(arr[j]>arr[i]) {
					res[i]=arr[j];
					break;
				}
				j++;
			}
			if(j==arr.length) {
				res[i]=-1;
			}
		}
		return res;
	}
	
	public static int[] nextGreater2(int[] arr) {
		int[] rs = new int[arr.length];
		Stack<Integer>  st = new Stack<Integer>();
		
		for(int i =arr.length-1;i>=0;i--) {
			while(!st.empty()&&st.peek()<=arr[i]) {
				st.pop();
			}
			rs[i] = st.empty()?-1:st.peek();
			st.push(arr[i]);
			
		}
		return rs;
	}
}
