 package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		
		WebElement s = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		s.click();
		 
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("jagandhana24@gmail.com");
		
		WebElement c = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		c.click();
		
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("jagan");
		
		
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("sekar");
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("jagan123123");
		
		WebElement d = driver.findElement(By.id("days"));
		Select s1 = new Select(d);
		s1.selectByValue("4");
		
		WebElement d1 = driver.findElement(By.id("months"));
		Select s2 = new Select(d1);
		s2.selectByVisibleText("August ");
		
		WebElement d2 = driver.findElement(By.id("years"));
		Select s3 = new Select(d2);
		s3.selectByVisibleText("1999  ");
		
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("2d entertainment");
		
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("3/483 a perumal kovil street , pidamaneri");
		
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("dharmapuri , tn29");
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("dharmapuri");
	
		WebElement d3 = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select s4 = new Select(d3);
		s4.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("63701");
		
		driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys(" jagan jd , b.sc , m.sc , he is a good boy");
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9442852655");
		
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("9677945031");
		
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys(" ");
		
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		
		
		
		
	}

}
