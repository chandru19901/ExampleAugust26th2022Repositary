package com.methodoverloadingandrecursion.practice;

class Digit
{
	void Digit(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];

		}
		System.out.println("sum of number:"+sum);
	}
}

public class WamDigits {

	public static void main(String[] args) {

		Digit obj=new Digit();

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		obj.Digit(arr);

	}

}
