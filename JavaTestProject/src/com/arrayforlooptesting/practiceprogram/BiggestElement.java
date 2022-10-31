package com.arrayforlooptesting.practiceprogram;



import java.util.Scanner;
public class BiggestElement {
	public static void main(String[] args)
	{
		int arr[] = readArr();
		int se1=big(arr,0); int se2=big(arr,1);
		System.out.println("Biggest Element is "+se1);
		System.out.println("Second Biggest Element is "+se2);
	}
	static int[] readArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many elements: ");
		int n= sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+ n+" values ");
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}
		return ar;
	}
	static int big(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					count++;
				}
			}
			if(count==n)
				return arr[i];
		}
		return 0;
	}
}

