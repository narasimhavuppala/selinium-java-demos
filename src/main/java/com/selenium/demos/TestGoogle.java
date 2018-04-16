package com.selenium.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\mindtree\\BDD-Cucumber-Selenium-Ruby\\Softwares\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		// options.addArguments("disable-infobars", "headless");

		WebDriver driver = new ChromeDriver(options);

		driver.navigate().to("http://google.com");

		SearchContext sc = driver;

		WebElement searchTextBox = sc.findElement(By.id("lst-ib"));
		searchTextBox.sendKeys("Selenium");
		searchTextBox.submit();

	}

}
