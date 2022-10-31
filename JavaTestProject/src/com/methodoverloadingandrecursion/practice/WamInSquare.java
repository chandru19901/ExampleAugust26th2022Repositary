package com.methodoverloadingandrecursion.practice;

class Square
{
	int Squrenum(int n)
	{
		if(n==0)
		{
			return 0;

		}
		return Squrenum(n-1)+2*n-1;
	}
}

public class WamInSquare {

	public static void main(String[] args) {

		Square obj=new Square();

		int res=obj.Squrenum(5);
		System.out.println(res);
	}

}
