package test;

public class pattern {
	public static void main(String[] args) {
		int sum =5;
		char ch ='A';
		for(int i =1;i<=sum;i++) {
			char p=ch;
			for(int j =1;j<=i;j++,p++) {
				System.out.print(p);
			}
			for(int j =2,k=p-2;j<=i;j++,k--) {
				
				System.out.print((char)k);
				
			}
			System.out.println();
		}
	}
}
