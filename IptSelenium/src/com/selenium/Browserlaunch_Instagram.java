package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Instagram {
	
	public static void main(String[ ] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kumar\\\\eclipse-workspace\\\\IptSelenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("KumaranKK");
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("8575646");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		System.out.println("Browser Launch Task - ID,NAME,CLASS");
	}

}
