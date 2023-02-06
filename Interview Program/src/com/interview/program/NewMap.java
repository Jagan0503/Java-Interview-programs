package com.interview.program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NewMap {
	static int empId;
	String name;
	String dept;
	public NewMap(String name, String dept) {
		this.name=name;
		this.dept=dept;
	}

	public static void main(String[] args) {

		HashMap<Integer, NewMap> map=new HashMap();
		map.put(10, new NewMap("tamil","velan"));
		map.put(20, new NewMap("Tamil","velan"));
		map.put(30, new NewMap("Tamil","velan"));
		map.put(40, new NewMap("Tamil","velan"));
		map.put(50, new NewMap("Tamil","velan"));
		map.put(70, new NewMap("Tamil","velan"));
		Set<Entry<Integer,NewMap>> set = map.entrySet();
		for (Entry<Integer, NewMap> entry : set) {
			System.out.print(entry.getKey()+" ");
			System.out.print(entry.getValue().name+" ");
			System.out.print(entry.getValue().dept+" ");
			System.out.println();
		}		
//
//	}
		
}
}
