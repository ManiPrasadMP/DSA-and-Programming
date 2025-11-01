package bls;

import java.util.ArrayList;
import java.util.List;

public class FibbonacciArray {

	public static void main(String[] args) {
		
		int[] ar = {0,1,2,3,4,5,6,7,6};
		List<Integer> fa = new ArrayList<Integer>();
		
		fa.add(ar[0]);
		int a = 1;
		int b = 1;
		while(b<=ar.length-1) {
			fa.add(ar[b]);
			int temp = b;
			b = a+b;
			a = temp;
			
		}
		System.out.println(fa);
	}
}
