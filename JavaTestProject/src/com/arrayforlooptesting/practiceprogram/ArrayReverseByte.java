package com.arrayforlooptesting.practiceprogram;

public class ArrayReverseByte {

	public static void main(String[] args) {
		//declare the byte array

		byte arr[]= {1,2,3,4,5};

		for(byte i=(byte) ( arr.length-1); i>=0; i--)
		{


			System.out.println(arr[i]);
		}
	}

}
