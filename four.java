package com.example.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class four {
  @Test
  public void login() throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  String actual_url=driver.getCurrentUrl();
	  WebElement user=driver.findElement(By.name("username"));
	  user.sendKeys("Admin");
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  String expected_url=driver.getCurrentUrl();
	  Assert.assertNotEquals(actual_url,expected_url);
	  Thread.sleep(3000);
  }
}
