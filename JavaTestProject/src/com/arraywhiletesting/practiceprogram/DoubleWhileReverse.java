package com.arraywhiletesting.practiceprogram;

public class DoubleWhileReverse {

	public static void main(String[] args) {
		double arr[]= {10,20,30,40,50};

		int   i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
	}

}


