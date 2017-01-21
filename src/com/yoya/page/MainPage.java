package com.yoya.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver dr;
	//�½���ӰԪ��
	@FindBy(xpath ="//i[@class='icon icon-newly-built']")
	@CacheLookup
	private WebElement createMovie;


//���캯������ʼ��Ԫ�أ�����Ԫ��ӳ�䵽����õı�����

	public MainPage(WebDriver _driver) {
		dr=_driver;
		PageFactory.initElements(dr, this);

	}
	
	
	public void CreateMovie(){
		
		createMovie.click();
		
	}
}