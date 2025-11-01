package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairSocks {
	
	public static void main(String[] args) {
		
		int[] ar = {12,13,15,12,13,14,15,13,14,12,11,6,7,11};
		
		System.out.println(Arrays.toString(ar));
		Set<Integer> st = new HashSet<Integer>();
		
		int pair = 0;
		
		for(int ele : ar) {
			if(st.contains(ele)) {
				pair++;
				st.remove(ele);
			}
			else
				st.add(ele);
		}
		
		System.out.println(pair);
	}

}
