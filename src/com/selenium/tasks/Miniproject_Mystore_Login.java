package com.selenium.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_Mystore_Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("reshma@gmail.com");
		
		WebElement crtAc = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		crtAc.click();	
		
		Thread.sleep(5000);
		
		WebElement mrs = driver.findElement(By.xpath("(//div[@class='radio'])[2]"));
		mrs.click();
		
		WebElement firName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firName.sendKeys("Reshma");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastName.sendKeys("Bodapati");
		
		WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		passwd.sendKeys("Reshma@123");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day);
		s.selectByValue("7");

		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 = new Select(month);
		s1.selectByValue("5");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(year);
		s2.selectByValue("1995");
		
		WebElement newLet = driver.findElement(By.xpath("//input[@id='newsletter']"));
		newLet.click();
		
		WebElement splOff = driver.findElement(By.xpath("//input[@id='optin']"));
		splOff.click();
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("GreenTech");
		
		WebElement add1 = driver.findElement(By.xpath("//input[@id='address1']"));
		add1.sendKeys("DLF");
		
		WebElement add2 = driver.findElement(By.xpath("//input[@id='address2']"));
		add2.sendKeys("Porur");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s4 = new Select(state);
		s4.selectByValue("5");
		
		WebElement zipCode = driver.findElement(By.xpath("//input[@id='postcode']"));
		zipCode.sendKeys("51235");
		
		WebElement addInfo = driver.findElement(By.xpath("//textarea[@id='other']"));
		addInfo.sendKeys("Hi");
		
		WebElement homeNo = driver.findElement(By.xpath("//input[@id='phone']"));
		homeNo.sendKeys("2348567");
		
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobNo.sendKeys("9857615476");
		
		WebElement addAlias = driver.findElement(By.xpath("//input[@id='alias']"));
		addAlias.sendKeys("India");
		
		WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		register.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MyStore.png");
		FileUtils.copyFile(source, destination);
	}
}
