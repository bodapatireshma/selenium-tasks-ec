package com.selenium.tasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miniproject_Mystore_Booking2 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("reshma@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Reshma@123");
		
		WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signin.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		act.click(tshirts).build().perform();
		
		WebElement image = driver.findElement(By.xpath("(//img[@title='Faded Short Sleeve T-shirts'])[1]"));
		act.moveToElement(image).build().perform();
		
		WebElement quickView = driver.findElement(By.xpath("//a[@class='quick-view']"));
		act.click(quickView).build().perform();

		driver.switchTo().frame(0);
		
		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		quantity.clear();
		
		WebElement quantity1 = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		quantity1.sendKeys("2");
		
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s = new Select(size);
		s.selectByValue("3");
		
		WebElement pinkclr = driver.findElement(By.xpath("//a[@id='color_14']"));
		pinkclr.click();
		
		WebElement addCart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addCart.click();
		
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		
//		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart1.png");
		FileUtils.copyFile(source, destination);
		
		WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed1.click();
		
		WebElement txtBox = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		txtBox.sendKeys("Hi");
		
		WebElement proceed2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceed2.click();
		
		WebElement tickBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		tickBox.click();
		
		WebElement proceed3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceed3.click();
		
		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank.click();
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart2.png");		
		FileUtils.copyFile(source1, destination1);
}

}
