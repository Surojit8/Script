package com.twebsite.manage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us ");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tide Ultra OXI");
		driver.findElement(By.xpath("//button[@aria-label='Sumbit Search']")).click();
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		driver.findElement(By.xpath("(//span[@class='ps-button-label'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ps-online-buy-button unavailable ps-online-seller-button']")));
		driver.findElement(By.xpath("//button[@class='ps-online-buy-button unavailable ps-online-seller-button']")).click();
	}

}
