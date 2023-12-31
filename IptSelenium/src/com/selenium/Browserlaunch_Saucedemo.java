package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Saucedemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("Kumaran");
		
		WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("123456");
		
		WebElement logIn = driver.findElement(By.id("login-button"));
		logIn.click();
		
		System.out.println("Locators Task - ID,NAME,CLASS");
	}


}
