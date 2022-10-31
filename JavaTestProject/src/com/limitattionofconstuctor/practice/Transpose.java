package com.limitattionofconstuctor.practice;

class Transpose1 
{
	void Transpose(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=(a[i][j]);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}


	public class Transpose {

		public static void main(String[] args) {
			int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
			int b[][]=new int[a.length] [a[0].length];
			Transpose1 T=new Transpose1();
			T.Transpose(a,b);
		}


	}

}
