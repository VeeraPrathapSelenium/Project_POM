package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class Tc_01 {

	
	public static void main(String[] args) {
		
		
		
		GenericMethods generic=new GenericMethods();
		generic.launchApplication("chrome");
		
		
		WebElement element=generic.driver.findElement(By.xpath("//input[@id='FirstName']"));
		
		generic.waitForPresenceOfElement(element, "FirstName", "register", 5);
		
		
		
		
		
	}
	
	
	
	
}
