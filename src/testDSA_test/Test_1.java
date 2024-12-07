package testDSA_test;

public class Test_1 {
public static void main(String[] args) {
	int[] a= {5,2,6,1,4};
	int c=maxPro(a);
	System.out.println(c );
}
static int maxPro(int[] a ) {
	int max=0;
	int[] left=new int[a.length];
	int[] right=new int[a.length];
	left[0]=a[0];
	for (int i = 1  ; i < a.length; i++) {
		left[i]=Math.max(a[i], left[i-1]);
	}
	right[a.length-1]=a[a.length-1];
	for (int i = right.length-2; i >=0; i--) {
		right[i]=Math.max(right[i+1], a[i]);
	}
	for (int i = 0; i < right.length; i++) {
		max+=Math.min(right[i] , left[i])-a[i] ;
	}
	return max;
}
}

