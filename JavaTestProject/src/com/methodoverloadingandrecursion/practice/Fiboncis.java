package com.methodoverloadingandrecursion.practice;

class Fiboncy
{
	int Fib(int m)
	{
		if(m==0||m==1)
		{
			return m;

		}
		return(Fib(m-1)+Fib(m-2));
	}
}

public class Fiboncis {

	public static void main(String[] args) {
		Fiboncy obj=new Fiboncy();
		int res=obj.Fib(10);
		System.out.println(res);
	}

}
