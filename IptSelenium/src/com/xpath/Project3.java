package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		WebDriver kumaran = new ChromeDriver();
		kumaran.manage().window().maximize();
		kumaran.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		kumaran.get("https://www.instagram.com/accounts/emailsignup/");
		WebElement mobilenumber = kumaran.findElement(By.xpath("(//input[@autocapitalize='off'])[1]"));
		mobilenumber.sendKeys("8675948579");
		WebElement fullname = kumaran.findElement(By.xpath("//input[@autocapitalize='sentences']"));
		fullname.sendKeys("Kumaran");
		WebElement lastname = kumaran.findElement(By.xpath("(//input[@autocapitalize='off'])[2]"));
		lastname.sendKeys("Karuppannan");
		WebElement password = kumaran.findElement(By.xpath("(//input[@autocapitalize='off'])[3]"));
		password.sendKeys("56565656");
		
		System.out.println("Using Relative X-Path ");
		
	}

}
