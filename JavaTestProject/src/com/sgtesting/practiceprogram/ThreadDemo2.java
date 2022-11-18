package com.sgtesting.practiceprogram;



class MyThread implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)

			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"Display Even Number:"+i);
				}

			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread job=new  MyThread();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);

		t1.setName("alpha");
		t2.setName("omega");
		t1.start();
		t2.start();

	}

}
