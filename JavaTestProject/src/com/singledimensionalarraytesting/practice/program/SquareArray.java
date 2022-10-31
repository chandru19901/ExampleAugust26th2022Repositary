package com.singledimensionalarraytesting.practice.program;

public class SquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++)
		{
			count++;

		}
		System.out.println(count);
		int num[]=new int[count]; 
		for(int k=10;k>=1;k--)
		{
			int res=k*k;
			System.out.println(res);
		}
		
		  for(int j=num.length-1;j>=0;j--) 
		  {
			  System.out.println(num[j]); 
			  }
		 
	}

}
