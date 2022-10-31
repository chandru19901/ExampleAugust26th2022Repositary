package com.twodimensionalarraytesting.practiceprogram;

public class TwoDArrayAssignmentReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = {{'a','b','c'},{'d','f','g'},{'h','i','j'}};
		for(int i=arr.length-1;i>=0;i--)
		{
			for( int j=arr.length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
	}

}
