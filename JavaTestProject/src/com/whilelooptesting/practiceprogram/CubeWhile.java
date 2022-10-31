package com.whilelooptesting.practiceprogram;

public class CubeWhile {

	public static void main(String[] args) {
		int res=1;
		int i=10;
		while(i>=1)
		{
			res=i*i*i;
			String result="Cube*"+i+"="+res;
			{
				System.out.println(result);
			}
			i--;
		}

	}

}
