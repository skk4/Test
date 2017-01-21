package com.yoya.test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.yoya.page.LoginPage;
import com.yoya.page.MainPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest {

	WebDriver driver;

	@BeforeTest
	
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
	}
	
	
	@Test
	
	public void testopen() throws InterruptedException
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.OpenUrl();
		Thread.sleep(3000);
		
		
	}
	
	@Test
	
	public void testsingin() throws InterruptedException{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.SignIn();
		Thread.sleep(3000);
		
	}
	
	
	@Test
	
	public void testusrlongin() throws InterruptedException{
		LoginPage loginpage = new LoginPage(driver);
		MainPage  maipage = new MainPage(driver);
		loginpage.UserLogin("xiesj", "123456");
		Thread.sleep(10000);
		maipage.CreateMovie();
		Thread.sleep(3000);
	}
		



	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	

}
