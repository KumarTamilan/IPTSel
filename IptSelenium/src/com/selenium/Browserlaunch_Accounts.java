package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Accounts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login");
		
		WebElement UserName = driver.findElement(By.id("login-username"));
		UserName.sendKeys("jdhrye");
		Thread.sleep(5000);
		WebElement captcha = driver.findElement(By.id("login-password"));
		captcha.sendKeys("6767654");
		
		WebElement logIn = driver.findElement(By.id("login-button"));
		logIn.click();
		System.out.println("Locators Task - ID,NAME,CLASS");
	}

}
