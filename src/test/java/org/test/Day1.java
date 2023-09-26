package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

WebElement popup = driver.findElement(By.xpath("//span[@class='_30XB9F']"));
popup.click();
WebElement search = driver.findElement(By.name("q"));
search.sendKeys("Iphone");
WebElement icon = driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]"));
icon.click();


			
	}

}
