package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch_Customerportal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kumar\\\\eclipse-workspace\\\\IptSelenium\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://user.readylink.in/customer_portal");
		
		WebElement UserName = driver.findElement(By.name("username"));
		UserName.sendKeys("jdhrye");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("jgjfufi");
		
		WebElement logIn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		logIn.click();
		
		System.out.println("Locators Task - ID,NAME,CLASS");
}
}
