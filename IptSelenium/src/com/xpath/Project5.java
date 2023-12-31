package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		WebDriver kumaran = new ChromeDriver();
		kumaran.manage().window().maximize();
		kumaran.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		kumaran.get("https://phptravels.org/login");
		WebElement email = kumaran.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("kumaran123@gmail.com");
		WebElement password = kumaran.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("7647585748");
		WebElement checkBox = kumaran.findElement(By.xpath("//div[@id='rc-anchor-container']"));
		checkBox.click();
		Thread.sleep(4000);
		WebElement login = kumaran.findElement(By.xpath("//button[@id='login']"));
		login.click();
		
		System.out.println("Using Relative X-Path ");
		System.out.println("Captcha not click");
	}

}
