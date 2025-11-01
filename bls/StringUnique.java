package bls;

public class StringUnique {

	public static void main(String[] args) {
		
		String st = "Aesz";
		int[] freq = new int[26];
		boolean rs = true;
		for(char c : st.toLowerCase().toCharArray()) {
			freq[c-97]++;
			if(freq[c-97]==2) {
				rs = false;
				break;
			}
		}
		System.out.println(rs);
	}
}
