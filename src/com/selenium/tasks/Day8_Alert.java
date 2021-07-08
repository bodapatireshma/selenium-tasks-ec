package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//question-1---done
		
//		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		WebElement btn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
//		btn1.click();
//		Thread.sleep(2000);
//		Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
//		
//		WebElement btn2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));		
//		btn2.click();
//		Thread.sleep(7000);             //default appears in 5sec 
//		Alert alert2 = driver.switchTo().alert();
//		alert2.accept();
//		
//		WebElement btn3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		btn3.click();
//		Thread.sleep(3000);
//		Alert alert3 = driver.switchTo().alert();
//		alert3.accept();
//		
//		WebElement btn4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
//		btn4.click();
//		Alert alert4 = driver.switchTo().alert();
//		alert4.sendKeys("Reshma");
//		Thread.sleep(2000);
//		alert4.accept();
		
//question-2---website not working
		
//question-3---not working bcoz banking sector
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(5000);
//		
//		WebElement cont = driver.findElement(By.xpath("//a[@onclick='return fretrieveCustId();']"));
//		cont.click();
		
//question-4---done
//		
//		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
//		driver.manage().window().maximize();
//		
//		WebElement signin = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
//		signin.click();
//		
//		Alert alert6 = driver.switchTo().alert();
//		alert6.accept();
		
//question-5---done
//		
//		driver.get("https://retail.onlinesbi.com/retail/login.htm");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//
//		WebElement loginCtn = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
//		loginCtn.click();
//		
//		WebElement login = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
//		login.click();
//		
//		Thread.sleep(2000);
//		
//		Alert alert7 = driver.switchTo().alert();
//		alert7.accept();
		
//question-6---	doubt--while program running popup showing which is not seen in the website
//		
//		driver.get("https://www.sprint.com/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(5000);
//		
//		WebElement acc = driver.findElement(By.xpath("//button[@id='user-links-dropdown']"));
//		acc.click();
		
//question-7---doubt--no username and password--asking qr code
		
//question-8---not working bcoz banking sector
//		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().window().maximize();
//		
//		WebElement cusId = driver.findElement(By.xpath("//input[@type='text']"));
//		cusId.sendKeys("25698745");
		
//question-9---done		
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
			
		WebElement username = driver.findElement(By.name("DUMMY1"));
		username.sendKeys("bodapatireshma");
		
		WebElement arrow = driver.findElement(By.className("input-arrow"));
		arrow.click();
		
		WebElement userId = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		userId.sendKeys("bodapatireshma");
		
		WebElement password = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		password.sendKeys("123456");
		
		WebElement login = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
		login.click();
	}
}