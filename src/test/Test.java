package test;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = generateLength();
		int[] a = new int[length];
		
		for(int i = 0; i < length; i++)
			a[i] = generateRand();
		
		System.out.print("Unsorted: ");
		printArray(a);
		
		Arrays.sort(a);
		System.out.print("Sorted: ");
		printArray(a);
		
		System.out.print("Variance: " + Math.round(sd(a)));
	}

	public static int generateLength() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length of the array: ");
		
		int length = input.nextInt();
		
		return length;
	}
	
	public static int generateRand() {
		int rand = (int)(Math.random()*100);
		
		return rand;
	}
	
	public static void printArray(int a[]) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
	}
	
	public static double sd(int[] a) {
		double var;
		double sd;
		int sum = 0;
		double sqd = 0;
		
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		
		double avg = (double)sum/a.length;
		
		for(int i = 0; i < a.length; i++) {
			sqd += Math.pow((a[i]-avg), 2);
		}
		
		return sd = Math.sqrt(sqd/a.length);
	}
}
