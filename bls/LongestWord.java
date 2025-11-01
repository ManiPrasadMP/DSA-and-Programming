package bls;

public class LongestWord {

	public static void main(String[] args) {
		String st = "abc abc hjkl";
		int s = 0;
		int max = 0;
		for(int i  = 0;i<st.length();i++) {
			if(Character.isLetter(st.charAt(i))){
				s++;
			}else {
				if(max<s)
					max = s;
				s=0;
			}
		}
			if(max<s) {
				max =  st.length()-s;
			}
			System.out.println(max);
		
	}
}
