package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Text_Print {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//iframe
		
//		driver.get("https://demoqa.com/frames");
//		driver.manage().window().maximize();
//		
//		driver.switchTo().frame(0);
//		
//		WebElement iframe = driver.findElement(By.id("sampleHeading"));
//		String text = iframe.getText();
//		System.out.println(text);
		
	//nested frame
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		WebElement oframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(oframe);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(iframe);
		
		WebElement itext = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String text = itext.getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		WebElement oframe1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String text2 = oframe1.getText();
		System.out.println(text2);
		
		
		
		
		
		
		
		
		
		
		
		
}
}