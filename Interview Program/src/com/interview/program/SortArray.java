package com.interview.program;

public class SortArray {
	
	public static void main(String[] args) {
	int ar[]= {10,9,8,7,6,3,5,4,3,2,2,1};
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar.length;j++) {
			if(ar[i]<ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	int j=0;
	int tem[]=new int[ar.length];
	for(int i=0;i<ar.length-1;i++) {
		if(ar[i]!=ar[i+1])
		tem[j++]=ar[i];
	}
	tem[j]=ar[ar.length-1];
	
	for(int i:tem) {
		if(i!=0)
		System.out.println(i);
	}
	}
}
