package test;

public class number {
public static void main(String[] args) {
int num =5;
for (int i = 1,p='A'; i <=num; i++) {
	for (int j = 1,l=p; j <=i; j++,l++) {
		System.out.print((char)l);
		
		
	}
	
	
	for (int j = 2,k=p; j <=i; j++,k++) {
		int temp=k+2;
		System.out.print((char)temp);
	}
	System.out.println();
}
}
}
