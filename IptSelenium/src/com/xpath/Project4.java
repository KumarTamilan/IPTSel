package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		WebDriver kumaran = new ChromeDriver();
		kumaran.manage().window().maximize();
		kumaran.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		kumaran.get("https://demo.openmrs.org/openmrs/login.htm");
		
		WebElement username = kumaran.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Kumaran");
		WebElement password = kumaran.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("7564756488");
		WebElement login = kumaran.findElement(By.xpath("//input[@id='loginButton']"));
		login.click();
		
		System.out.println("Using Relative X-Path ");
	}

}
