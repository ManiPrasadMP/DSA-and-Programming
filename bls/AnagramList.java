package bls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramList {

	public static void main(String[] args) {
		
		String[] words = {"eat","ate","abc","cab","tea"};
		
		List<List<String>> ang = new ArrayList<List<String>>();
		
		for(int i = 0 ;i<words.length;i++) {
			boolean get = false;
//			System.out.println(words[i]);
			for(int j = 0;j<ang.size();j++) {
					if(isAnagram(words[i],ang.get(j).get(0))) {
						ang.get(j).add(words[i]);
						get = true;
//						System.out.println(words[i]);
						break;
					}
				}
			if(!get) {
//				System.out.println(words[i]);
				ArrayList<String> al = new ArrayList<String>();
				al.add(words[i]);
				ang.add(al);
			} 
		}		
	System.out.println(ang);	
		
	}
	static boolean isAnagram(String s1,String s2) {
		
		char[] ar1 = s1.toCharArray();
		Arrays.sort(ar1);
		char[] ar2 = s2.toCharArray();
		Arrays.sort(ar2);
		
		s1 = new String(ar1);
		s2 = new String(ar2);

		return s1.equals(s2);
	}
}
