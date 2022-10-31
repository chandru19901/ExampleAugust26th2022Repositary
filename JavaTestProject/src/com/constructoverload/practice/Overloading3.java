package com.constructoverload.practice;

class Player
{
	Player (String Playname)
	{
		
		System.out.println("Player Name:"+Playname); 
	}
	Player (int Playage)
	{
		System.out.println("Playage:"+Playage);
	}
	Player(String series,int game)
	{
		System.out.println("series:"+series+"age:"+series);
	}
}

public class Overloading3
{
	public static void main(String args[])
	{
		Player bcc=new Player("sachin");
	    Player bdd=new Player(40);
		Player bss=new Player("series");
	}
}




	


