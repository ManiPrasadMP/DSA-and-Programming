package bls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FlightProblem {

	public static void main(String[] args) {
		
		List<Flight> input = new ArrayList<Flight>();
		input.add(new Flight("12:13", "F101"));
		input.add(new Flight("09:14", "F102"));
		input.add(new Flight("12:14", "F103"));
		input.add(new Flight("09:14", "F104"));
		input.add(new Flight("09:14", "F104"));
		
		Map<String, Integer> freq = new HashMap<String, Integer>();
		
		for(Flight f : input) {
			String t = f.time.substring(0,2);
			if(freq.containsKey(t)) {
				freq.put(t,freq.get(t)+1);
			}
			else
				freq.put(t,1);
		}
		String time = "";
		int count = 0;
		Set<Entry<String, Integer>> es = freq.entrySet();
		for(Entry<String, Integer> e : es) {
			if(count<e.getValue()) {
				count = e.getValue();
				time = e.getKey();
			}
		}
		System.out.println(time);
	}
}
