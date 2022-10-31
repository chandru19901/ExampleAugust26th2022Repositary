package com.returnmethod.practice;



class Matrices
{
	int[][] Substraction()
	{
		int a[][]= {{100,200,300,400},{200,300,400,500}};
		int b[][]= {{10,20,30,40},{20,30,40,50}};
		int c[][]=new int[a.length][a[1].length];
		for(int i=a.length-1;i>=0; i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		return c;

	}
}

public class WamSubstraction {

	public static void main(String[] args) {

		Matrices mat=new Matrices();
		int  c[][]=mat.Substraction();

		
		for(int i=c.length-1;i>=0;i--)
		{
			for(int j=c[i].length-1;j>=0;j--)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}




