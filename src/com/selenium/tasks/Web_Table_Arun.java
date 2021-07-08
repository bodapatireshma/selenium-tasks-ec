package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Arun {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
	int rows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr[3]")).size();
	System.out.println(rows);
	
	int cols = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr[3]/td")).size();
	System.out.println(cols);
	
	
for (int i = 3; i <= 3; i++) {
	for (int j = 1; j <= 2; j++) {
		String data = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr[3]/td[3]")).getText();
		System.out.print(data+"    ");
		System.out.println();
	
	}
}		
		
	}	
		
		
		
}