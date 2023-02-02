package com.interview.program;

import java.util.LinkedList;

public class WithoutSplit {
	
	public static void main(String[] args) {
		String name="Hi I am tamilvelan";
		LinkedList<String> list =new LinkedList();
		int count=0;
		for(int i=1;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				String string = name.substring(count, i);
				list.add(string);
				count++;
			}
		
		}
		for(String lists:list) {
			System.out.println(lists);
		}
		
		
		
		
	}

	
}
