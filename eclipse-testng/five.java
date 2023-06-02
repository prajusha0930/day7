package com.example.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class five {
    WebDriver driver;
    @Test(groups= {"smoketest"})
    public void f() throws InterruptedException{
  	  WebDriverManager.edgedriver().setup();
  		driver = new EdgeDriver();
  		driver.navigate().to("https://www.godaddy.com/en-in");
  		driver.manage().window().maximize();
  		String actualTitle=driver.getTitle();
  		Assert.assertEquals(actualTitle, driver.getTitle());
  		String actualUrl=driver.getCurrentUrl();
  		Assert.assertEquals(actualUrl, driver.getCurrentUrl());
  		Thread.sleep(3000);
  		driver.close();
    }
      @Test(groups= {"Regressiontest"})
	  public void s() throws InterruptedException{
		  WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to("https://www.godaddy.com/en-in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
			Thread.sleep(1500);
			driver.close();
	  }
	
}
