package com.selenium.tasks;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Create_Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Jack");
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("Rose");
		
		WebElement mobnum = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobnum.sendKeys("9176239825");
		
		WebElement passwd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		passwd.sendKeys("abcd@1234");

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("24");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByIndex(20);
		
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		female.click();
		
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
	}
}