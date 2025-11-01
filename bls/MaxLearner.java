package bls;

public class MaxLearner {

	public static void main(String[] args) {
		
		String[] times = {"09.24-16.56","11.24-23.23","08.56-18.31"};
		String[] learn = {"a","b","c"};
		int max = 0;
		int index = -1;
		for(int i = 0;i<times.length;i++) {
			int spent = gettime(times[i]);
			if(spent>max) {
				max = spent;
				index = i;
			}
		}
			System.out.println(learn[index]+" : "+(max/60)+"."+(max%60));
		}

	private static int gettime(String st) {
		
		String[] time = st.split("-");
		
		int min1 = Integer.parseInt(time[0].substring(3));
		int hr1 =  Integer.parseInt(time[0].substring(0,2));
		int min2 = Integer.parseInt(time[1].substring(3));
		int hr2 =  Integer.parseInt(time[1].substring(0,2));
		
		int total = (hr2*60+min2) - (hr1*60+min1);
		return total;
	}
}
