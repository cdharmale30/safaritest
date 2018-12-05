package com.safaritest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.gmail.com");
System.out.println(1);
System.out.println(1);	
	}

}
