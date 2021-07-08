package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown_Task1 {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.id("select-demo"));
		
		Select s = new Select(multi);
		
		boolean multiple = s.isMultiple();
		System.out.println("is multiple ?"+multiple);
		
		s.selectByValue("Thursday");
}
}