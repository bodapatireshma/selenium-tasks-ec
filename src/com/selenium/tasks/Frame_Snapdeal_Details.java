package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Snapdeal_Details {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");	
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		signin.click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("(//a[@href='https://www.snapdeal.com/login'])[1]"));
		login.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		WebElement mobnum = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		mobnum.sendKeys("8759642319");
		
	}
}