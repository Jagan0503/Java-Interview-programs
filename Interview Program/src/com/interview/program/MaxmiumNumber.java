package com.interview.program;

import java.util.Scanner;

public class MaxmiumNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int val=input.nextInt();
		System.out.println("Enter the value 2: ");
		int val1 = input.nextInt();
		System.out.print("Enter the value 3: ");
		int val2=input.nextInt();
		if(val>val1 && val>val2) {
			System.out.println("max"+val);
		}
		else if (val1>val2 && val1>val) {
			System.out.println("max"+val1);
		}
		else {
			System.out.println("max"+val2);
		}
	}

}
