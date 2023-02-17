package com.interview.program;

public class StringSort {
	public static void main(String[] args) {
		String name="9z8x2s5a1";
		   char []val=name.toCharArray();
		   for(int i=0;i<val.length;i++){
		       for(int j=i+1;j<val.length;j++){
		           if((int)val[i]>(int)val[j]){
		               char temp=val[i];
		               val[i]=val[j];
		               val[j]=temp;
		           }
		       }
		   }
		   for(char c:val){
		       System.out.print(c);
		   }
	}

}
