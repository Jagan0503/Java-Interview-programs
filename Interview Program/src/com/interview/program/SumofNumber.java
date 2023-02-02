package com.interview.program;

import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input=sc.nextInt();
		int count = 0;
		for(int i=0; i<=input; i++) {
			count=count+i;
		}
		System.out.println("The sum of number is "+count);
	}
}
