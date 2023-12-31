package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("jdhrye");
		
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys("jgjfufi");
		
		WebElement logIn = driver.findElement(By.className("selected"));
		logIn.click();
		
		System.out.println("Locators Task - ID,NAME,CLASS");
	}

}
