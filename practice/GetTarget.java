package practice;

import java.util.Arrays;
import java.util.Scanner;

public class GetTarget {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,5,3,2,4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the target : ");
		int t = sc.nextInt();
		int n_count = arr.length;
		
		for(int i = arr.length-1;i>=0;i--) {
			int count=1;
			if(arr[i]>=t) {
				n_count=1;
				break;
			}
			int sum = arr[i];
			System.out.println("loop 1 :"+sum);
			for(int j = arr.length-1;j>=0;j--) {
				if(i!=j) {
					sum +=arr[j];
					count++;
					System.out.println(sum+" "+count);
					if(sum>=t)
						break;
				}	
			}
			if(n_count>count)
				n_count = count;
		}
		
		System.out.println(n_count);
	}
	

}
