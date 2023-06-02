package com.example.testng;

import org.testng.annotations.Test;

public class day7 {
  @Test(groups= {"SmokeTest"})
  public void display1() {
	  System.out.println("Display1");
  }
  @Test(groups= {"Regression TestCase"})
  public void display2() {
	  System.out.print("Display2");
  }
  @Test(groups= {"Regression TestCase"})
  public void display3() {
	  System.out.print("Display3");
  }
}
