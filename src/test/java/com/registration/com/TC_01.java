package com.registration.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");
		
		 //chrome capabilities
		 ChromeOptions cp=new ChromeOptions();
		 cp.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver=new ChromeDriver(cp);
		 
		 driver.get("http://practice.automationtesting.in/");
		 driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/my-account/\"]")).click();
		 driver.findElement(By.name("email")).sendKeys("samyuktha2595@gmail.com");
		 driver.findElement(By.id("reg_password")).sendKeys("Samyu@1995");
		 driver.findElement(By.name("register")).click();

	}

}
