package com.twodimensionalarraytesting.practiceprogram;

public class TwoDArrayAssignment3 {

	public static void main(String[] args) {
		String arr[][]= {{" sahu","karu","chand"},{"heis","from","racr"}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
