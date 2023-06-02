package com.example.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest {
  @Test
  public void verifyTitle() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, driver.getTitle());
  }
}
