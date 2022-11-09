package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckoDriver {
	public static WebDriver Browser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();

	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","C:\\ExamleAutomation\\Automation\\Web-Automation\\Library\\driver\\geckodriver.exe");
			Browser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try
		{
			Browser.get("http://www.microsoft.com");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			Browser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}





