package com.interview.program;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayContain {
	
	public static void main(String[] args) {
		int ar[]={1,2,3};
		int arr[]={1,2,3,4,6,7};
		HashSet<Integer> set=new HashSet();
//		for(int i=0;i<ar.length;i++) {
//			set.add(ar[i]);
//		}
//		
		
		for (Integer dup : arr) {
			if(set.contains(dup))
				continue;
			else
				System.out.println(dup);
		}
	}
}

//output is show only duplicate value
//input={1,2,3,5}; input{1,2,3};
//output={5}