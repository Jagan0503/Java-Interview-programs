package com.interview.program;

public class Stringrev {
	  public static void main (String[]args)
	  {
	    String input = "emis health";
	    String name=input.replace(" ", "");
	    String let = "";
	   
	    for (int i = 1; i < name.length (); i++)
	      {
		if (i % 2 != 0)
		  {
		    let = let + name.charAt (i);
		    let = let + name.charAt (i-1);
		  }
		
	      }
	    System.out.println (let);
	  }
	}

