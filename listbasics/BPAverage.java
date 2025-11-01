package listbasics;

public class BPAverage {

	public static void main(String[] args) {
		
		int[] ar = {72,75,75,87,125,80,88,87,139,88};
		
		double sum = ar[0];
		boolean prev = false;
		
		for(int i = 1;i<ar.length;i++) {
			double avg = sum/i;
			double dif = Math.abs(avg-ar[i]);
			if((avg*20/100)<dif)
			{
				if(prev) {
					System.out.println(i+" , "+(i+1));
					break;
				}
				else
					prev = true;
			}
			else {
				if(prev)
					prev = false;
			}
			sum +=ar[i];
		}
	}
}
