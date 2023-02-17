package com.interview.program;

import java.util.ArrayList;

public class Splitwithout {
	
	public static void main(String[] args) {
	    String name="Hi I am Tamilvelan";
	    ArrayList<String> list=new ArrayList();
	    int start=0;
	    for(int i=1;i<name.length();i++){
	        if(name.charAt(i)==' '){ 
	            list.add(name.substring(start,i));
	            start=i+1;
	        }
	        
	    }list.add(name.substring(start,name.length()));
	    for(int i=list.size()-1;i>=0;i--){
	        System.out.println(list.get(i));
	    }
	}
}
