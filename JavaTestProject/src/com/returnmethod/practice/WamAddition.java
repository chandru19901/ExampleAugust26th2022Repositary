package com.returnmethod.practice;

class Matrixes
{
	int[][] Addition(int a[][],int b[][])
	{
		
		int c[][]=new int[a.length][a[1].length];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;

	}

}


public class WamAddition {

	public static void main(String[] args) {

		int a[][]= {{10,20,30,40},{20,30,40,50}};
		int b[][]= {{100,200,300,400},{200,300,400,500}};
		
		Matrixes mat=new Matrixes();
		int  c[][]=mat.Addition(a,b);

	
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}
