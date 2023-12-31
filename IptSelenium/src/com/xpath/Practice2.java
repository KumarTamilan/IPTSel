package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		WebDriver kumaran = new ChromeDriver();
		kumaran.manage().window().maximize();
		kumaran.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		kumaran.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
		
		WebElement dropdown = kumaran.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div[2]/div/div/div/p/select"));
		dropdown.click();
	}

}
