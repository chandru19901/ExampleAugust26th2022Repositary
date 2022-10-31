package com.limitattionofconstuctor.practice;

class Factorial
{
	void Factorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial number:"+fact);
	}
}
public class Calculation1
{
	public static void main(String args[])

	{
		Factorial fact=new Factorial();
		fact.Factorial(5);
		fact.Factorial(6);
	}


}



