package com.selenium.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling_Fivepages {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	//Actions
		Actions ac = new Actions(driver);
	//Robot 
		Robot r = new Robot();
	//bestsellers
		WebElement best = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(best).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	//mobiles	
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(mobile).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	//fashion
		WebElement fashion = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(fashion).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	//new releases
		WebElement newRel = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		ac.contextClick(newRel).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	//electronics
		WebElement electronics = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		ac.contextClick(electronics).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	//windows handling	
		Set<String> allId = driver.getWindowHandles();
			System.out.println("-----ALL TITLES-----");
		for (String id : allId) {
			String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
		}
	//best sellers page
		String actualTitle = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in\r\n";
		
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				break;
			}
			driver.close();
		}//driver.close();
		Thread.sleep(2000);
//		driver.quit();
	}
}