package com.twebsite.manage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tide {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us ");
		
		Actions a=new Actions(driver);
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		a.moveToElement(driver.findElement(By.xpath("(//a[@itemprop='url'])[1]"))).build().perform();
		driver.findElement(By.xpath("(//a[@class='event_menu_click '])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ps-button-label'])[1]")).click();

	}

}
