package com.yoya.page;
import java.sql.Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver dr;
	
	private final String url="http://test.yoya.com"; 
	//定义页面登录首页
	@FindBy(id ="_yoya_login")
	@CacheLookup
	private WebElement signIn;
	
	//定义用户名
	@FindBy(id ="_pop_user_name")
	@CacheLookup
	private WebElement userName;
	
	
	//定义密码
	@FindBy(id ="_pop_password")
	@CacheLookup
	private WebElement passWord;
	
	//定义登录按键
	@FindBy(id ="_pop_user_login")
	@CacheLookup
	private WebElement userLogin;
	
	
	//构造函数来初始化元素，即将元素映射到定义好的变量上

	public LoginPage(WebDriver _driver) {
		dr=_driver;
		PageFactory.initElements(dr, this);

	}
	
	
	public void OpenUrl(){
		dr.get(url);
		
	}
	
	public void SignIn(){
		signIn.click();
	}
	
	public void UserLogin(String username, String password){
		
		//signIn.click();
		userName.clear();
		userName.sendKeys(username);
		passWord.clear();
		passWord.sendKeys(password);
		userLogin.click();
	}

}
