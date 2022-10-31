package com.singledimensionalarraytesting.practice.program;

public class OneDimArrayDemo {

	public static void main(String[] args) {

		int count=0;
		for(int i=20;i<=40;i++)
		{	
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("# of elements "+count);

		int k=0;
		int even[]=new int[count];
		for(int p=20;p<=40;p++)
		{
			if(p%2==0)
			{
				even[k]=p;  
				k=k+1;
			}
		}

		for(int j=even.length-1;j>=0;j--)
		{
			System.out.println(even [j]);
		}
	}
}


