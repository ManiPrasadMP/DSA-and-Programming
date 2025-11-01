package stacks;

public class BreakingRec {

	public static void main(String[] args) {
		
		int[] ar = {12,24,10,24};
		
		int[] sc = new int[2];
		int min=ar[0];
		int max = ar[0];
		
		for(int i = 1;i<ar.length;i++) {
			if(ar[i]>max) {
				sc[0]++;
				max=ar[i];
			}
			if(ar[i]<min) {
				sc[1]++;
				min = ar[i];
			}
		}
		System.out.println(" max "+sc[0]+"  : min "+sc[1]);
	}
}
