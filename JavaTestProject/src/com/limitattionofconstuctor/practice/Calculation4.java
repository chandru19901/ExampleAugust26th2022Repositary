package com.limitattionofconstuctor.practice;

class Multiplication
{
	void Tables(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			{


				System.out.println(num+" * "+i+" = "+res);
			}
		}
	}

	public class Calculation4
	{
		public static void main(String[] args) 
		{
			Multiplication b=new Multiplication();
			b.Tables(10);
		}

	}
}





