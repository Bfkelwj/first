package test;

public class test34 {
	public static void main(String[] args) {

		int[] num1={4,46,8,9};
		int finalNumber=0;
		
		for (int i = 0; i < num1.length; i++) 
		{
			String current="";
			current=current+num1[i];
			for (int j = 0; j < num1.length; j++)
			{
				if(i==j)
				{
					continue;
				}

				current=current+num1[j];
			}
			int number=Integer.parseInt(current); 
			if(number>finalNumber)
			{
				finalNumber=number;
			}	
		}
		System.out.println(finalNumber);
	}
}
