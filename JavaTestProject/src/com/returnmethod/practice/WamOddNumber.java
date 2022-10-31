package com.returnmethod.practice;

class Oddnum
{
	int count (int a,int b)
	{
		int count=0;
		for( int i=a;i>=b;i--)
		{
			if(i%2==1)
			{
				count++;

			}
		}
		return count;
	}

	int[] Oddidentity(int m,int n )
	{
		int k=this.count(m,n);

		int res[]=new int[k];
		int j=0;

		for(int i=m;i>=n;i--)
		{
			if(i%2==1)
			{
				res[j]=i;
				System.out.println(res[j]);
				j++;

			}
		}
		return res;
	}
}
public class WamOddNumber
{
	public static void main(String args[])
	{

		Oddnum o1=new Oddnum();
		int c[]=o1.Oddidentity(141,111);
		System.out.println("_ _ _ _ _ _ _ _ _ ");
		System.out.println("total number:"+c.length);
	}
}

