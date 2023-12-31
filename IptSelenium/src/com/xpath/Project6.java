package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\IptSelenium\\driver\\chromedriver.exe");
		WebDriver kumaran = new ChromeDriver();
		kumaran.manage().window().maximize();
		kumaran.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		kumaran.get("https://ultimateqa.com/complicated-page");
		Thread.sleep(20000);
		WebElement cancel = kumaran.findElement(By.xpath("//button[@class='formkit-close']"));
		cancel.click();
		WebElement name = kumaran.findElement(By.xpath("(//input[contains(@class,'input')])[1]"));
		name.sendKeys("Kumaran");
		WebElement email = kumaran.findElement(By.xpath("//input[contains(@id,'et_pb_contact_email_0')]"));
		email.sendKeys("Kumaran123@gmail.com");
		WebElement message = kumaran.findElement(By.xpath("(//textarea[contains(@data-field_type,'text')])[1]"));
		message.sendKeys("Hi I am Kumaran");
		Thread.sleep(3000);
		WebElement total = kumaran.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		total.sendKeys("9");
		WebElement submit = kumaran.findElement(By.xpath("(//button[contains(@type,'submit')])[1]"));
		submit.click();
		
		WebElement username = kumaran.findElement(By.xpath("//input[contains(@id,'user_login_658213495db4e')]"));
		username.sendKeys("Kumaran");
		WebElement password = kumaran.findElement(By.xpath("(//input[contains(@type,'password')])[1]"));
		password.sendKeys("3847563832");
		WebElement login = kumaran.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
		login.click();
		
		kumaran.navigate().back();
		
		WebElement name1 = kumaran.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
		name1.sendKeys("Kumaran1");
		WebElement email1 = kumaran.findElement(By.xpath("//input[contains(@name,'et_pb_contact_email_1')]"));
		email1.sendKeys("Kumaran321@gmail.com");
		WebElement message1 = kumaran.findElement(By.xpath("//textarea[contains(@id,'et_pb_contact_message_1')]"));
		message1.sendKeys("Hi I am Kumaran1");
		WebElement total1 = kumaran.findElement(By.xpath("(//input[contains(@size,'2')])[2]"));
		total1.sendKeys("21");
		WebElement submit1 = kumaran.findElement(By.xpath("(//button[contains(@type,'submit')])[3]"));
		submit1.click();
		Thread.sleep(3000);
		WebElement username1 = kumaran.findElement(By.xpath("//input[contains(@id,'user_login_6582134967b22')]"));
		username1.sendKeys("Kumaran1");
		WebElement password1 = kumaran.findElement(By.xpath("//input[contains(@id,'user_pass_6582134967b22')]"));
		password1.sendKeys("38475622834");
		WebElement logIn1 = kumaran.findElement(By.xpath("(//button[contains(@type,'submit')])[4]"));
		logIn1.click();
		
		WebElement name2 = kumaran.findElement(By.xpath("//input[contains(@id,'et_pb_contact_name_2')]"));
		name2.sendKeys("Kumaran2");
		WebElement email2 = kumaran.findElement(By.xpath("//input[contains(@id,'et_pb_contact_email_2')]"));
		email2.sendKeys("Kumaran546@gmail.com");
		WebElement message2 = kumaran.findElement(By.xpath("//textarea[contains(@id,'et_pb_contact_message_2')]"));
		message2.sendKeys("Hi I am Kumaran2");
		WebElement total2 = kumaran.findElement(By.xpath("(//input[contains(@size,'2')])[3]"));
		total2.sendKeys("13");
		WebElement submit2 = kumaran.findElement(By.xpath("(//button[contains(@type,'submit')])[5]"));
		submit2.click();
	}

}
