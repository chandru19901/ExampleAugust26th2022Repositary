package com.patternwhilelooptesting.practiceprogram;

public class PatternThirdWhile {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{	
				System.out.print(j+" ");
				j++;
			}
			i--;
			System.out.println();


		}
	}

}