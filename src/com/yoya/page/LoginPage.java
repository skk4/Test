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
	//����ҳ���¼��ҳ
	@FindBy(id ="_yoya_login")
	@CacheLookup
	private WebElement signIn;
	
	//�����û���
	@FindBy(id ="_pop_user_name")
	@CacheLookup
	private WebElement userName;
	
	
	//��������
	@FindBy(id ="_pop_password")
	@CacheLookup
	private WebElement passWord;
	
	//�����¼����
	@FindBy(id ="_pop_user_login")
	@CacheLookup
	private WebElement userLogin;
	
	
	//���캯������ʼ��Ԫ�أ�����Ԫ��ӳ�䵽����õı�����

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
