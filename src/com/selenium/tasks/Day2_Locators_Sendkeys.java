package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Locators_Sendkeys {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

//question-1---done
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		//WebElement email = driver.findElement(By.id("email"));
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("bodapatireshma@gmail.com");
		
		//WebElement password = driver.findElement(By.id("pass"));
		WebElement password = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		password.sendKeys("reshma@123");

		//WebElement login = driver.findElement(By.name("login"));
		//login.click();
		//WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		//create.click();

//question-2---doubt
		
//		driver.get("https://www.redbus.in/");
//		driver.manage().window().maximize();
//		
//		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		from.sendKeys("Chennai");
////		Thread.sleep(2000);
//		WebElement chn = driver.findElement(By.xpath("//li[@data-id='123']"));
//		Select s = new Select(chn);
//		s.selectByValue("1");
//		
//		WebElement to = driver.findElement(By.id("dest"));
//		to.sendKeys("Hyderabad");
//		WebElement hyd = driver.findElement(By.xpath("//li[@data-id='124']"));
//		Select s1 = new Select(hyd);
//		s1.selectByValue("1");
		
//question-3---done
		
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("GreensTechnology");
//		Thread.sleep(2000);
//		WebElement porur = driver.findElement(By.xpath("(//div[@class='wM6W7d'])[4]"));
//		Select s2 = new Select(porur);
//		s2.selectByVisibleText("greens technology porur");
		
//question-4---website not working
		
//		driver.get("https://www.lvbankonline.in/index.html?module=login");
//		WebElement username = driver.findElement(By.xpath("//oj-input-text[@type='text']"));
//		username.sendKeys("Reshma");
		
//question-5---done
		
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		driver.manage().window().maximize();
//			
//		WebElement username = driver.findElement(By.name("DUMMY1"));
//		username.sendKeys("bodapatireshma");
//		
//		WebElement arrow = driver.findElement(By.className("input-arrow"));
//		arrow.click();
//		
//		WebElement userId = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
//		userId.sendKeys("bodapatireshma");
//		
//		WebElement password = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
//		password.sendKeys("123456");
//		
//		WebElement login = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
//		login.click();
						
//question-6---done
		
//		driver.get("https://twitter.com/login");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		WebElement user = driver.findElement(By.name("session[username_or_email]"));
//		user.sendKeys("abc@klm.com");
//		
//		WebElement pass = driver.findElement(By.name("session[password]"));
//		pass.sendKeys("123654");
		
//question-7---not working bcoz banking sector
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().window().maximize();
//		
//		WebElement custom = driver.findElement(By.xpath("//input[@type='text']"));
//		custom.sendKeys("57695423");
		
//question-8---done	
		
//		driver.get("https://www.swiggy.com");
//		driver.manage().window().maximize();
//		
//		WebElement loc = driver.findElement(By.xpath("//input[@id='location']"));
//		loc.sendKeys("Avadi");
		
//question-9---done
		
//		driver.get("https://www.snapdeal.com/login");
//		driver.manage().window().maximize();
//		
//		WebElement mobno = driver.findElement(By.id("userName"));
//		mobno.sendKeys("9587422570");
		
//question-10---done
		
//		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("abcd@insta.com");
//		
//		WebElement passwd = driver.findElement(By.name("password"));
//		passwd.sendKeys("wxyz@123");
		
//question-11---done
		
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.manage().window().maximize();
//		
//		WebElement okBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		Thread.sleep(2000);
//		okBtn.click();
//		
//		WebElement from = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
//		from.sendKeys("CHENNAI BEACH - MSB");
//		
//		WebElement to = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
//		to.sendKeys("KURNOOL CITY - KRNT");
		
//question-12---done
		
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//		
//		WebElement username = driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
//		username.sendKeys("lion@king.com");
//		
//		WebElement password = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
//		password.sendKeys("jungle@123");
	}
}