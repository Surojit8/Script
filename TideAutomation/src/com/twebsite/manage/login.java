package com.twebsite.manage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us ");
		
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		driver.findElement(By.xpath("//a[@rel='noreferrer']")).click();
		
		String Parent=driver.getWindowHandle();
		for(String child:driver.getWindowHandles() ) {
			driver.switchTo().window(child);
		}
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.id("login-email")).sendKeys("samantatheking@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("@Ss8371059433");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='LOG IN']")));
		driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[49]")));
		driver.findElement(By.xpath("(//button[@type='button'])[49]")).click();
		
		
		

	}

}
