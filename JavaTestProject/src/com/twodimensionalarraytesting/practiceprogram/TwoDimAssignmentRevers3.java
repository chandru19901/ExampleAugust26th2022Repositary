package com.twodimensionalarraytesting.practiceprogram;

public class TwoDimAssignmentRevers3 {

	public static void main(String[] args) {
		String arr[][]= {{" sahu","karu","chand"},{"heis","from","racr"}};
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
