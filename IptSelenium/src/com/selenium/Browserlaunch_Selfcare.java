package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Selfcare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selfcare.actcorp.in/home");
		Thread.sleep(10000);
		WebElement UserId = driver.findElement(By.xpath("(//input[@id='userId'])[1]"));
		UserId.sendKeys("Kumar@gmail.com");
		
		WebElement captcha = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		captcha.sendKeys("9578608914");
		
		WebElement logIn = driver.findElement(By.xpath("//a[text()=' Need help?']"));
		logIn.click();
		
		System.out.println("Locators Task - ID,NAME,CLASS");
	}
}
