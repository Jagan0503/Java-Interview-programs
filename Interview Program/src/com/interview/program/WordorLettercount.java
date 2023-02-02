package com.interview.program;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class WordorLettercount {
		public static void main(String[] args) {
	        String name="Big black bug bit a big black dog on his big black nose";
	        char names[]=name.toCharArray();
	        HashMap<Character, Integer> map=new HashMap();
	        for(char count:names){
	            if(map.containsKey(count)){
	                int size=map.get(count);
	                map.put(count, size+1);
	            }
	            else{
	                map.put(count, 1);
	            }
	        }
	     System.out.println(map);
			}
	        }

	
