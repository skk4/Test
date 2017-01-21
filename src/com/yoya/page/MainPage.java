package com.yoya.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver dr;
	//新建电影元素
	@FindBy(xpath ="//i[@class='icon icon-newly-built']")
	@CacheLookup
	private WebElement createMovie;


//构造函数来初始化元素，即将元素映射到定义好的变量上

	public MainPage(WebDriver _driver) {
		dr=_driver;
		PageFactory.initElements(dr, this);

	}
	
	
	public void CreateMovie(){
		
		createMovie.click();
		
	}
}