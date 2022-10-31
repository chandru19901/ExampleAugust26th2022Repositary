package com.staticpractice.program;

class calculation {

	void addition()
	{


		int x,y,res;
		x=25;
		y=55;
		res=x+y;
		System.out.println("addition Result:"+res);
	}



}


public class Practice2Donotcontainparameters{
	public static void main(String[] args) {
		calculation o=new calculation();
		o.addition();
		o.addition();
		calculation o2=new calculation();
		o2.addition();



	}

}
