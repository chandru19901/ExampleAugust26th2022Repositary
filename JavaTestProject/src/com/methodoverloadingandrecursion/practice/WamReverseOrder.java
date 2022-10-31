package com.methodoverloadingandrecursion.practice;

class Reverseorder
{
	void Reverse(int a[])
	{
		for(int i=a.length;i>0;i--)
		{
			System.out.println(" "+i);
		}
	}
}

public class WamReverseOrder {

	public static void main(String[] args) {

		Reverseorder obj=new Reverseorder();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		obj.Reverse(arr);
	}

}
