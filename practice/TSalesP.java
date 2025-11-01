package practice;

import java.util.Scanner;

public class TSalesP {
	
	static int[][] coast;
	static boolean[] visited;
	static int minCoast = Integer.MAX_VALUE;
	public static void main(String[] args) {
		coast = getCost();
		printMatrix();
		visited = new boolean[coast.length];
		visited[0] = true;
			tsp(0,1,0);
			System.out.println("Min cost : "+minCoast);
	}

	private static void tsp(int curCity, int vCount, int curCoast) {
		if(vCount == coast.length) {
			System.out.println("Current min coast : "+(curCoast+coast[curCity][0]));
			minCoast = Math.min(minCoast, curCoast+coast[curCity][0]);
			return;
		}
		
		for(int nxCity = 0;nxCity<coast.length;nxCity++) {
			if(!visited[nxCity] && coast[curCity][nxCity] > 0) {
				visited[curCity] = true;
				tsp(nxCity,vCount+1,curCoast+coast[curCity][nxCity]);
				visited[curCity] = false;
			}
		}
		
	}

	private static int[][] getCost() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of cities");
				int n = sc.nextInt();
		int[][] cost = new int[n][n];
		System.out.println("enter elements");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++)
				cost[i][j] = sc.nextInt();
		}
		return cost;
	}

	private static void printMatrix() {
		System.out.println(" Distance matrix is : ");
		for(int i = 0;i<coast.length;i++) {
			for(int j = 0;j<coast.length;j++)
				System.out.printf("%2d ",coast[i][j]);
			System.out.println();
		}
	}
}
