package com.selenium.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown_Task2 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			driver.manage().window().maximize();
			
			WebElement multiDropdown = driver.findElement(By.name("States"));
			Select s = new Select(multiDropdown);
			boolean multiple = s.isMultiple();
			System.out.println("is multiple ?"+multiple);
			
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
				System.out.println(webElement.getText());
			}
			int size = options.size();
			System.out.println("size ::"+size);
			
			for (int i = 0; i < size; i++) {
				Thread.sleep(1000);
				if (i==4 && i==1 && i==3) {
					s.selectByIndex(i);
				}
			
//			for (int i = 0; i < size; i++) {
//				Thread.sleep(1000);
//				if (i==4 || i==1 || i==3) {
//					s.selectByIndex(i);
//				}
//				System.out.println("*** first selected option ***");
//				WebElement firstSelectedOption = s.getFirstSelectedOption();
//				System.out.println(firstSelectedOption.getText());
			
			
}
}}