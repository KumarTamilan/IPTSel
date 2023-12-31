package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Netbanking {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.kotak.com/knb2/");
		
		WebElement UserName = driver.findElement(By.id("userName"));
		UserName.sendKeys("jdhrye");
		
		WebElement captcha = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		captcha.sendKeys("jgjfufi");
		
		WebElement logIn = driver.findElement(By.xpath("//a[text()=' Need help?']"));
		logIn.click();
		
		System.out.println("Locators Task  - ID,NAME,CLASS");
	}

}
