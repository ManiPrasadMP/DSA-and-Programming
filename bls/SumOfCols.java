package bls;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfCols {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 3;
		int n = 3;
		int[][] mat = {{10,20,30},{20,25,35},{10,5,15}};
		
		int[] sum = new int[n];
		for(int i = 0;i<n;i++) {
			int s = 0;
			for(int j = 0;j<m;j++) {
				s += mat[j][i];
			}
			sum[i] = s;
		}
		
		System.out.println(Arrays.toString(sum));
	}
}
