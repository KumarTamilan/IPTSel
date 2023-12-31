package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		WebDriver kumaran = new ChromeDriver();
		kumaran.manage().window().maximize();
		kumaran.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		kumaran.get("https://www.htopsolutions.com/?gclid=EAIaIQobChMIy4nasYabgwMVxgNyCh2lUQRiEAAYASAAEgJy3PD_BwE");
		Thread.sleep(10000);
		WebElement cancel = kumaran.findElement(By.xpath("(//span[@aria-hidden='true'])[2]"));
		cancel.click();
		WebElement name = kumaran.findElement(By.xpath("(//input[@type='text'])[3]"));
		name.sendKeys("Kumaran");
		Thread.sleep(4000);
		WebElement mobileNumber = kumaran.findElement(By.xpath("//input[@type='tel']"));
		mobileNumber.sendKeys("8796879685");
		WebElement email = kumaran.findElement(By.xpath("(//input[@type='email'])[2]"));
		email.sendKeys("kumarsss12@gmail.com");
		WebElement dropdown = kumaran.findElement(By.xpath("(//select[@id='contactcf'])[2]"));
		Select s = new Select(dropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByValue("Core Java Training");
		WebElement message = kumaran.findElement(By.xpath("//textarea[@name='your-message']"));
		message.sendKeys("I am joining");
		WebElement submit = kumaran.findElement(By.xpath("(//input[@type='submit'])[1]"));
		submit.click();
		
		System.out.println("Using Relative X-Path ");
		/*
		 * WebElement course =
		 * kumaran.findElement(By.xpath("//span[@style='margin-left:1px;']")); Actions
		 * as = new Actions(kumaran);
		 * 
		 * as.moveToElement(course).build().perform(); WebElement freeze =
		 * kumaran.findElement(By.xpath("//span[text()='Java Training']"));
		 * freeze.click(); Thread.sleep(4000); Actions as1 = new Actions(kumaran);
		 * 
		 * as1.moveToElement(course).build().perform(); WebElement java =
		 * kumaran.findElement(By.xpath("(//a[@class='list-group-item'])[128]"));
		 * java.click();
		 */
	}

}
