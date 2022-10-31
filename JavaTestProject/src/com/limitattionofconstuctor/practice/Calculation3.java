package com.limitattionofconstuctor.practice;

class Substraction
{
	void Substraction1(int a[][],int b[][])
	{
		int c[][] = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];

				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}

	public class Calculation3 {

		public static void main(String[] args) {
			int a[][]= {{5,4,6},{8,7,9}};
			int b[][]= {{4,2,9},{3,5,4}};
			int c[][]=new int[a.length][a[0].length];
			Substraction o=new Substraction();
			o.Substraction1(a, b);


		}

	}
}
