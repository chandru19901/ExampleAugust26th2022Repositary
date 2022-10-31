package com.twodimensionalarraytesting.practiceprogram;

public class TwoDAssignmentReverse1 {

	public static void main(String[] args) {
		double arr[][]= {{10.5,12.5,13.5},{14.5,15.5,16.5},{17.5,18.5,19.5}};
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
