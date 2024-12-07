package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class duplicates {
public static void main(String[] args) {
	int a[]= {1,2,2,1};
	 
	
	HashSet<Integer> s1= new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		s1.add(a[i]);
	}
	int i=0;
	int[] b=new int[s1.size()];
	for(int num:s1) {
		b[i++]=num;
	}
	for (int j = 0; j < b.length; j++) {
	for (int j2 = 0; j2 < b.length; j2++) {
		System.out.println(b[j]+" "+b[j2]); 
		
	}
	}
}
}
