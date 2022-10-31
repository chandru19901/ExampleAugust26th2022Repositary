package com.singledimensionalarraytesting.practice.program;

public class OneDimeArrayOddNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=41;i<=71;i++)
		{
			if(i%2==1)
			{
				count++;
			}
		}

		System.out.println("# of elements "+count);
		int k=0;
		int odd[]=new int[count];
		for(int p=41;p<=71;p++)
		{
			if(p%2==1)
			{
				odd[k]=p;
				k=k+1;
			}

		}
		
		  for(int j=odd.length-1;j>=0;j--) 
		  { 
			  System.out.println(odd[j]); 
		  }
	}
}