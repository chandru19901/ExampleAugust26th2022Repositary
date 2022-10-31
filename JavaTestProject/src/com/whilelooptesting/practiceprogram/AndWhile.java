package com.whilelooptesting.practiceprogram;

public class AndWhile {

	public static void main(String[] args) {
		int count=0;
		int i=10;
		while(i<=90)
		{
			if((i%3==0)&&(i%6==0)&&(i%9==0))
			{
				count++;
			}
			System.out.println(count);
			
		}

	}

}
