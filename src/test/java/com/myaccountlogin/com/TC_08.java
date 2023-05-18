package com.myaccountlogin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\SeleniumAutomation\\Softwares\\ChromeDriver\\chromedriver.exe");
		
		 //chrome capabilities
		 ChromeOptions cp=new ChromeOptions();
		 cp.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver=new ChromeDriver(cp);
		 
		 driver.get("http://practice.automationtesting.in/");
		 driver.findElement(By.xpath("//a[@href=\"https://practice.automationtesting.in/my-account/\"]")).click();
		 driver.findElement(By.name("username")).sendKeys("samyuktha2595@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Samyu@1995");
		 driver.findElement(By.name("login")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
		 
	}

}
