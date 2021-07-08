package com.selenium.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Preethi {

public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();	
	
	List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement data : allData) {
		System.out.println(data.getText());
	}
//	List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		
		
		
		
		
		
}
}