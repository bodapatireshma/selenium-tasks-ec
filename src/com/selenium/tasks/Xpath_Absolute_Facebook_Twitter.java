package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Absolute_Facebook_Twitter {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://en-gb.facebook.com/");
			
	WebElement username = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
	username.sendKeys("reshma@gmail.com");
			
	WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/div/input"));
	password.sendKeys("9876543210");
		
		
		
		
//	driver.get("https://twitter.com/login");
//		
//	WebElement username = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div/label/div/div[2]/div//input[@name='session[username_or_email]']"));
//	username.sendKeys("reshma@gmail.com");
//		
//	WebElement password = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div/label/div/div[2]/div//input[@name='session[password]']"));
//	password.sendKeys("9876543210");
}
}