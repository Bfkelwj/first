package test;


import java.util.Arrays;
import java.util.Iterator;

public class greatest_number {
	public static void main(String[] args) {
		int[] a= {8,9,46,4};
		for (int i = 1; i < a.length; i++) {
			for (int j =0 ; j <i ; j++) 
			{
				if(a[i]<10) 
				{
					if(a[i]<a[j]) 
					{
						System.out.println(a[j]);
					}
					
				}else 
				{
						int num=a[i]/10;
						if(a[j]>=num) {
							System.out.println(a[i]);
						}
				}
			}

		}
	}
}

