package com.interview.program;

public class ArmstrangNumber {

	public static void main(String args[]) {
	      
	      int c=0, check, rem, sum = 0;
	      for(int number=1;number<=500;number++) {
	      check = number;
	      while(check >0) {
	         rem = check % 10;
	         sum = sum + (rem * rem * rem);
	         check = check / 10;
	      }
	      if(sum == number) {
	    	 c++; 
	         System.out.println("Given number is an armstrong number."+c);}
	      else {
	         System.out.println("Given number is not an armstrong number."+c);
	   }}
	}}
