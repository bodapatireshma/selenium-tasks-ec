package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Locators_Xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

//question-1---incomplete
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement contactus = driver.findElement(By.xpath("//a[@href='contact.php']"));
		contactus.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("angel");
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("angel@123gmail.com");
		
		WebElement mobno = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		mobno.sendKeys("876543210");
		
		
		
		
}
}