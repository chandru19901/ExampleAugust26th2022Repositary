package com.arraywhiletesting.practiceprogram;

public class LaragestElement {

	public static void main(String[] args) 
	{
		int temp;
		int a[] = {55,10,8,90,43,87,95,25,50,12};
		int size = a.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("2nd largest element :"+a[size-1]);
		
		
	}

}
