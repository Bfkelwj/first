package test;



public class test2 {
	public static void main(String[] args) {
		int[] a= {2, 4, 3, 5,-2, 6, 4, 7, 8, 9};
		int ele=7;


		//EndOfMainMethod

		//WriteCode Here
		int cnt=0;
		for(int i =0;i<a.length;i++)
		{
			for(int j =i+1;j<a.length;j++){
				if(a[i]==a[j]){
					cnt++;
				}
			}
		}
		int b[]=new int[a.length-cnt];
		int index=0;
		for(int i =0;i<a.length;i++)
		{
			int cnt1=0;
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]==a[j]){
					cnt1++;
				}
			}
			if(cnt1==0){
				b[index++]=a[i];
			}
		}
		for(int we:b) {
			System.out.println(we); 
		}
		
		
		for(int i =0;i<b.length;i++)
		{
			for(int j =i+1;j<b.length;j++){
				if(b[i]+b[j]==ele)
				{
					System.out.println(b[i]+""+b[j]);
				}
			}
		}
	}
}

