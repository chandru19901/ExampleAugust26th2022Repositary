package com.twodimensionalarraytesting.practiceprogram;

public class TwoDAssignment2 {

	public static void main(String[] args) {
		char arr[][] = {{'a','b','c'},{'d','f','g'},{'h','i','j'}};
		for(int i=0;i<arr.length;i++)
		{
			for( int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}

	}
}
