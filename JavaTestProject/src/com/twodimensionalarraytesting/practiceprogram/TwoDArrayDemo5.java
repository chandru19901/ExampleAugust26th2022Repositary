package com.twodimensionalarraytesting.practiceprogram;

public class TwoDArrayDemo5 {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int b[]:arr)
		{
			for(int c:b)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}
}