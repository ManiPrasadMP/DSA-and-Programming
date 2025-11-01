package mapprob;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FruitProblem {
	
	public static void main(String[] args) {
		
		String[] f = {"Apple","Mango","Orange","Apple","Grapes","Mango","Orange","Mango","Apple","Orange"};
		Map<String, Integer> fcount = new LinkedHashMap<String, Integer>();
		
		for(String fruits : f) {
			if(fcount.containsKey(fruits))
				fcount.put(fruits, fcount.get(fruits)+1);
			else
				fcount.put(fruits, 1);
		}
		
		Set<Map.Entry<String, Integer>> entry = fcount.entrySet();
		
		for(Map.Entry<String, Integer> ent : entry) {
			System.out.println(ent);
			System.out.println(ent.getKey() +" : "+ent.getValue());
		}
	}

}
