package com.string.practice;

public class Assign4 {

	public static void main(String[] args) {



		reversesentence();

	}
	private static void reversesentence()
	{
		String s="Bangalore and Mysore";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(" "+s1[i]);
		}
	}
}



