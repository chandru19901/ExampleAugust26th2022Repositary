package com.patternwhilelooptesting.practiceprogram;

public class WhileFirstPattern {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{	
				System.out.print(j+" ");
				j++;
			}
			i++;
			System.out.println();

		}
			
		}

	}


