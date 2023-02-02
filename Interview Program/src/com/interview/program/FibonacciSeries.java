package com.interview.program;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Series number: ");
		int num=sc.nextInt();
		
		int f1, f2=0, f3=1;
		for(int i=0; i<=num; i++) {
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		
	}

}
