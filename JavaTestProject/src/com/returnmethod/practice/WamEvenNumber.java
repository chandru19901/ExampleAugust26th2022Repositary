package com.returnmethod.practice;

class Even
{

	int count (int a,int b) 
	{ 
		int count=0; 
		for(int i=0;i<=b;i++)
		{
			if(i%2==0) 
			{

				count++;
			}
		}
		return count;
	}


	int [] Evenidentity(int m,int n)
	{

		int k=this.count(m,n); 
		int res[]=new int[k];

		int  j=0;
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				res[j]=i;
				//System.out.println(res[j]);
				j++;
			}
		}
		return res;


	}
}
public class WamEvenNumber {

	public static void main(String[] args) {
		Even o1=new Even();
		int c[]=o1.Evenidentity(50,80);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");

		/* System.out.println("total number:"+c.length); */
		System.out.println(c);


	}

}
