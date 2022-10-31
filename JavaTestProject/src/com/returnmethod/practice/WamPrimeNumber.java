 package com.returnmethod.practice;

class Primenum
{
	boolean verifyprimenum(int num)
	{

		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1; 
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class WamPrimeNumber {

	public static void main(String[] args) {

		Primenum obj=new Primenum();
		for(int i=90;i>=20;i--)
		{
			if(obj.verifyprimenum(i)==false)
			{
				System.out.println(i+"is not a prime number");
			}
		}
	}

}



