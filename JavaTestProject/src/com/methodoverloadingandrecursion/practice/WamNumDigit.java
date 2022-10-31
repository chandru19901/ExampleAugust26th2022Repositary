package com.methodoverloadingandrecursion.practice;

class Digitnum
{
	void Digit(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;

		}
		System.out.println("count of number:"+count);
	}
}

public class WamNumDigit {

	public static void main(String[] args) {

		Digitnum obj=new Digitnum();

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		obj.Digit(arr);



	}

}
