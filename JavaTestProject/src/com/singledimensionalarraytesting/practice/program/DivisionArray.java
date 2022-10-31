package com.singledimensionalarraytesting.practice.program;

public class DivisionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=100;i<=150;i++)
		{
			if(i%4==0)
			{
				count++;
			}
		}

		System.out.println("# of elements "+count);
		int k=0;
		int div[]=new int[count];
		for(int p=100;p<=150;p++)
		{
			if(p%4==0)
			{
				div[k]=p;
				k=k+1;
			}

		}
		
		  for(int j=div.length-1;j>=0;j--) 
		  { 
			  System.out.println(div[j]); 
		  }

	}

}
