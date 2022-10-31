package com.patternwhilelooptesting.practiceprogram;

public class WhileFive {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{	
				System.out.print(k+" ");
				k++;
				j++;
			}
			i++;
			System.out.println();



	}

}
}