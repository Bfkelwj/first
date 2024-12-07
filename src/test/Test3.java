package test;

import java.util.*;

public class Test3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//size of first array
		int m = sc.nextInt();
		// take first arrays
		int a []=new int[m];
		for(int i =0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
	TreeSet<Integer> l1=new TreeSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		l1.add(a[i]);
	}
	//System.out.println(l1);
	int b[]= {3,5,1};
	TreeSet<Integer> l2=new TreeSet<Integer>();
	for (int i = 0; i < b.length; i++) {
		l2.add(b[i]);
	}
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l1.containsAll(l2));
	}
}

