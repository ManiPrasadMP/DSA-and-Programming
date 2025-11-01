package firstDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortList {

	public static void main(String[] args) {
		
		System.out.println("Create a list ");
		
		List<Integer> ls = createList();
		
		System.out.print("Your list is : ");
		printElements(ls);
		
		ls = insertionSort(ls);
		System.out.println();
		System.out.print("After sorting (Insertion) .... : ");
		printElements(ls);
		
		ls = selectionSort(ls);
		System.out.println();
		System.out.print("After sorting (Selection) .... : ");
		printElements(ls);
		
		ls = bubbleSort(ls);
		System.out.println();
		System.out.print("After sorting (Selection) .... : ");
		printElements(ls);
		
	}

	private static List<Integer> bubbleSort(List<Integer> ls) {
		
		if(ls.size()==0) {
			System.out.println("List is empty ...");
			return null;
		}
		
		for(int i = 0;i<ls.size()-2;i++) {
			for(int j = i+1;j<ls.size()-1;j++) {
				if(ls.get(j)<ls.get(i)) {
					 int temp = ls.get(i);
					 ls.set(i, ls.get(j));
					 ls.set(j, temp);
				}
			}
		}
		return ls;
	}

	private static List<Integer> insertionSort(List<Integer> ls) {
		
		if(ls.size()==0) {
			System.out.println("List is empty ...");
			return null;
		}
		for(int i = 1;i<ls.size();i++) {
			int ele = ls.get(i),j=i-1;
			
			while(j>=0 && ls.get(j)>ele) {
				ls.set(j+1, ls.get(j));
				j--;
			}
			ls.set(j+1, ele);
		}
		return ls;
	}
	
	private static List<Integer> selectionSort(List<Integer> ls) {
		if(ls.size()==0) {
			System.out.println("List is empty ...");
			return null;
		}
		
		for(int i = 0;i<ls.size();i++) {
			int min = i;
			
			for(int j=i+1;j<ls.size();j++) {
				if(ls.get(j)<ls.get(min)){
					min = j;
				}
			}
			int t = ls.get(min);
			ls.set(min, ls.get(i));
			ls.set(i, t);
		}
		return ls;
	}

	private static void printElements(List<Integer> ls) {
		
		if(ls.size()==0) {
			System.out.println("List is empty ...");
		}
		for(int i = 0;i<ls.size();i++) {
			System.out.print(ls.get(i)+" ");
		}
		
	}

	private static List<Integer> createList() {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> ls = new ArrayList<Integer>();
		
		System.out.println("Enter the size of list : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i = 0;i<n;i++) {
			ls.add(sc.nextInt());
		}
		return ls;
	}
}
