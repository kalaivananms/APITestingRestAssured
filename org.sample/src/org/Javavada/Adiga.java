package org.Javavada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Adiga {
	
	public static void main(String[] args) {
		
		int ar[]= new int [5];
		ar[0]=1000;
		ar[2]=2000;
		ar[3]=3000;
		for (int i = 0; i < ar.length; i++) {		
				
			}

		System.out.println(ar[3]);
		
		
	List<Object> ar1 = new ArrayList<Object>();
	ar1.add(1000);
	ar1.add(2000);
	ar1.add(3000);
	ar1.add(4000);
	ar1.add(5000);
	System.out.println(ar1);
	
	
	for (int i = 0; i < ar1.size(); i++) {
		System.out.println(ar1.get(i));
		
	}
  
	List<Object> ar2 = new LinkedList<Object>();
	ar2.add("Krrsih");
	ar2.add("123456");
	ar2.add(40009);
	ar2.add("kalai");
	
	System.out.println(ar2);
	

	Set<String> ar3 = new HashSet<>();
	ar3.add("1327");
	ar3.add("kalai");
	ar3.add("4567");
	ar3.add("56789");
	
	System.out.println(ar3);
	
	for (Object Object : ar3) {
		
		System.out.println(Object);
		
	}
	
	Set<String> ar4 = new TreeSet<String>();
	ar4.add("hari");
	ar4.add("dharu");
	ar4.add("java");
	
	System.out.println(ar4);
}
	
	
	
	

	
	

	
	

	
	
	}


