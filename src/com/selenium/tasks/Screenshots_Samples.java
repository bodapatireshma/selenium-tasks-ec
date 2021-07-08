package com.selenium.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots_Samples {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\GTpage.png");
		FileUtils.copyFile(source, destination);
		
		driver.navigate().to("https://www.hotstar.com/in");
		
		Thread.sleep(5000);
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\HSpage.png");
		FileUtils.copyFile(source1, destination1);
		
		driver.navigate().to("https://www.primevideo.com/?_encoding=UTF8&sr=1");
		
		Thread.sleep(5000);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\APpage.png");
		FileUtils.copyFile(source2, destination2);
	}
}