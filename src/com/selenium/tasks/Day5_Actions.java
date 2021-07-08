package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5_Actions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//question-2---done
//		driver.get("http://www.amazon.in");
//		driver.manage().window().maximize();
//		
//		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
//		electronics.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement mobacc = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
//		Actions ac = new Actions(driver);
//		ac.moveToElement(mobacc).build().perform();
//		
//		Thread.sleep(2000);
//		
//		WebElement powbank = driver.findElement(By.xpath("//a[text()='Power Banks']"));
//		ac.click(powbank).build().perform();
		
//question-3---done
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(home).build().perform();
		
		Thread.sleep(2000);
		
		WebElement bedrm = driver.findElement(By.xpath("//a[text()='Bedroom room']"));
		ac.moveToElement(bedrm).build().perform();
		
		Thread.sleep(2000);
		
		WebElement chair = driver.findElement(By.xpath("//a[text()='Office Chairs']"));
		ac.click(chair).build().perform();
		
		Thread.sleep(2000);
		
		WebElement chairsel = driver.findElement(By.xpath("(//img[contains(@alt,'Motion ')])[1]"));
		ac.click(chairsel).build().perform();
		
//		driver.get("https://www.flipkart.com/godrej-interio-motion-high-back-fabric-office-executive-chair/p/itmf8qwqdg5efebx?pid=OSCF8QSFHFGXZRZG&lid=LSTOSCF8QSFHFGXZRZGSUU7F4&marketplace=FLIPKART&store=wwe%2Fy7b%2Ffoc&srno=b_1_1&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L2_view-all&fm=organic&iid=en_gFPx5fE46QI6JCoTLRQNtYblgYtIrUeHBwJCsNEXno%2FxDvkVuZVCOR4%2BPHcoRoRIQRqlkR58EwWwA%2BnY0rbMmw%3D%3D&ppt=browse&ppn=browse&ssid=mhqz0nai800000001621625837080");
		driver.navigate().to("https://www.flipkart.com/godrej-interio-motion-high-back-fabric-office-executive-chair/p/itmf8qwqdg5efebx?pid=OSCF8QSFHFGXZRZG&lid=LSTOSCF8QSFHFGXZRZGSUU7F4&marketplace=FLIPKART&store=wwe%2Fy7b%2Ffoc&srno=b_1_1&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L2_view-all&fm=organic&iid=en_gFPx5fE46QI6JCoTLRQNtYblgYtIrUeHBwJCsNEXno%2FxDvkVuZVCOR4%2BPHcoRoRIQRqlkR58EwWwA%2BnY0rbMmw%3D%3D&ppt=browse&ppn=browse&ssid=mhqz0nai800000001621625837080");
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		ac.click(cart).build().perform();        //will ask for login
		
	}

}
