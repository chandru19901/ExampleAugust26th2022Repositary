package com.singledimensionalarraytesting.practice.program;

public class NinthTable {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++)
		{
			count++;

		}
		System.out.println(count);
		int res=9;
		for(int k=1;k<=10;k++)
		{
			res=k*9;
			System.out.println(res); 
		}
		
		  int num[]=new int[res]; 
		  for(int j=num.length-1;j<=10;j++)
		  {
		  System.out.println(num[j]); 
		  }
		 
		 
	}
}





