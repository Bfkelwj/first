package test;
import java.util.*;
import java.math.*;
public class Majja {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Vedya number sang reee bosadichya");
	long a=sc.nextLong();
	
	BigInteger b =BigInteger.ONE;
	for (long i = 1; i <=a; i++) {
		System.out.println(i);
		b=b.multiply(BigInteger.valueOf(i));
	}
	System.out.println(" 1 te vedya sangil tit paryant chi gunakar : "+b);
}
}
