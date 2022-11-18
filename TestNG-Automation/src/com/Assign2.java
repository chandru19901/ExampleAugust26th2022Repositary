package com.TestNGActitime.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign2 {
	public static WebDriver oBrowser =null;
	@Test(priority = 1)
	public static void launchBrowser()
	{
		try
		{

			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	public static void navigate()
	{ 
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test(priority = 3,dataProvider = "login")
	public static void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	public static void minimizeFlyOutwindow()
	{
		String expected;
		try
		{
			expected="Getting Started Shortcuts";
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5, dataProvider="createUser")
	public static void createUser(String fn, String mn,String ln, String eml,String un, String pw, String pwc)
	{
		WebElement oEle=null;
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fn);
			oBrowser.findElement(By.name("middleName")).sendKeys(mn);
			oBrowser.findElement(By.name("lastName")).sendKeys(ln);
			oBrowser.findElement(By.name("email")).sendKeys(eml);
			oBrowser.findElement(By.name("username")).sendKeys(un);
			oBrowser.findElement(By.name("password")).sendKeys(pw);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwc);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			oEle= oBrowser.findElement(By.xpath("//span[text()='3 accounts left']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority =6, dataProvider = " modifyuser" )
	public static void modifyuser(String p, String pc)                                                     
	{
		try
		{
			oBrowser.findElement(By.xpath("(//span[text()='User1, demo A.'])[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys(p);
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pc);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	private static void logout()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	@Test(priority = 7)

	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}

	@DataProvider(name= "createUser")
	public Object[][] getUserData()
	{
		return new Object[][] {{"demo","A","User1","demo@gmail.com","demoUser1","1234","1234"}};

	}
	@DataProvider(name =" modifyuser")
	public Object[][] getmodifyuser()
	{
		return new Object[][] {{"432","432"}};

	}
}




