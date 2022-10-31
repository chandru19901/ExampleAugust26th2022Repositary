package com.javatesting.practiceprogram;

public class AndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int count=0;
          int i=10;
          do
          {
        	  if((i%3==0)&&(i%6==0)&&(i%9==0))
        	  {
        		  count++;
        	  }
        	  
          }
          while(i<=90);
          System.out.println(count);
          
	}
	}


