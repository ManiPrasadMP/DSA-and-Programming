package bls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnagramMap {

	public static void main(String[] args) {
		
		String[] words = {"eat","ate","abc","cab","tea"};
		
		Map<String, ArrayList<String>> wlist = new LinkedHashMap<String, ArrayList<String>>();
		
		for(int i = 0;i<words.length;i++) {
			char[] ar1 = words[i].toCharArray();
			Arrays.sort(ar1);
			String s1 = new String(ar1);
			if(wlist.containsKey(s1)) 
					wlist.get(s1).add(words[i]);
			else
				{
				ArrayList<String> al = new ArrayList<String>();
				al.add(words[i]);
				wlist.put(s1, al);
				}
		}
		System.out.println(wlist.values());
		
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
