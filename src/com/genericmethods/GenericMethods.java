/**
 * 
 */
package com.genericmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	public WebDriver driver;
	
	/**
	 * @name:launchApplication()
	 * @purpose:This method is used to launch teh aplication, and it can be called when ever we required
	 * @input parametersString browsername
	 * @out parameters:
	 * @author:
	 * 
	 */
	public void launchApplication(String browsername)
	{
		switch(browsername.trim().toLowerCase())
		{
			
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
			
			driver.manage().window().maximize();
			// Logic to launch the  chrome browser
			System.out.println("Launching chrome browser");
			break;
		case "firefox":
			// Logic to launch the  firefox browser
			System.out.println("Launching firefoc browser");
			break;
		default:
			System.out.println("Wrong browser option");
			
			
		}
		
		
		
		
	}
	
	/**
	 * @name:hoverandClick()
	 * @purpose:This method is used to hover on an element and it will helps us to click 
	 * @input parameters :WebElement element,String Element name,String Pagename
	 * @out parameters:boolean 
	 * @author:
	 * 
	 */	
	
	public boolean hoverandClick(WebElement element,String elementname,String Pagename)
	{
		boolean status=true;
		
		try
		{
			Actions acc=new Actions(driver);
			acc.moveToElement(element).click(element).build().perform();
			System.out.println("The Element : "+elementname+" is cliked sucessfully on the Page :"+Pagename);
		}catch(Exception e)
		{
			System.out.println("The Element : "+elementname+" is not cliked sucessfully on the Page :"+Pagename);
			System.out.println(e.getMessage());
			status=false;
		}
		
		
		
		
		return status;
	}
	
	/**
	 * @name:waitForPresenceOfElement()
	 * @purpose:This method will wait till the element get display on the screen
	 * @input parameters:WebElement element,String elementname,String pagename,int timeout
	 * @out parameters:boolean
	 * @author:
	 * 
	 */
	public boolean waitForPresenceOfElement(WebElement element,String elementname,String pagename,int timeout)
	{
		boolean status=true;
		try{
			
			int pos1=element.toString().lastIndexOf(":")+1;
			int pos2=element.toString().lastIndexOf("]");
			System.out.println(element.toString().substring(pos1,pos2));
			String xpath=element.toString().substring(pos1,pos2);
			WebDriverWait wait=new WebDriverWait(driver, timeout);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			System.out.println("The element :"+elementname+" is loded sucessfully  on the page : "+pagename+" within the time "+timeout);
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
			System.out.println("The element :"+elementname+" is not loded sucessfully  on the page : "+pagename+" within the time "+timeout);
		}
		return status;
	}
	
	
	/**
	 * @name:waitForvisbility()
	 * @purpose:This method will wait till the element get display on the screen
	 * @input parameters:WebElement element,String elementname,String pagename,int timeout
	 * @out parameters:boolean
	 * @author:
	 * 
	 */
	public boolean waitForVisibilityOfElement(WebElement element,String elementname,String pagename,int timeout)
	{
		boolean status=true;
		try{
			
			int pos1=element.toString().lastIndexOf(":")+1;
			int pos2=element.toString().lastIndexOf("]");
			System.out.println(element.toString().substring(pos1,pos2));
			String xpath=element.toString().substring(pos1,pos2);
			WebDriverWait wait=new WebDriverWait(driver, timeout);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			System.out.println("The element :"+elementname+" is loded sucessfully  on the page : "+pagename+" within the time "+timeout);
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
			System.out.println("The element :"+elementname+" is not loded sucessfully  on the page : "+pagename+" within the time "+timeout);
		}
		return status;
	}
	
	/**
	 * @name:waitForClickable()
	 * @purpose:This method will wait till the element get display on the screen
	 * @input parameters:WebElement element,String elementname,String pagename,int timeout
	 * @out parameters:boolean
	 * @author:
	 * 
	 */
	public boolean waitForClickableOfElement(WebElement element,String elementname,String pagename,int timeout)
	{
		boolean status=true;
		try{
			
			int pos1=element.toString().lastIndexOf(":")+1;
			int pos2=element.toString().lastIndexOf("]");
			System.out.println(element.toString().substring(pos1,pos2));
			String xpath=element.toString().substring(pos1,pos2);
			WebDriverWait wait=new WebDriverWait(driver, timeout);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			System.out.println("The element :"+elementname+" is loded sucessfully  on the page : "+pagename+" within the time "+timeout);
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
			System.out.println("The element :"+elementname+" is not loded sucessfully  on the page : "+pagename+" within the time "+timeout);
		}
		return status;
	}
	
	/**
	 * @name:waitForInvisible()
	 * @purpose:This method will wait till the element get display on the screen
	 * @input parameters:WebElement element,String elementname,String pagename,int timeout
	 * @out parameters:boolean
	 * @author:
	 * 
	 */
	public boolean waitForInvisibleeOfElement(WebElement element,String elementname,String pagename,int timeout)
	{
		boolean status=true;
		try{
			
			int pos1=element.toString().lastIndexOf(":")+1;
			int pos2=element.toString().lastIndexOf("]");
			System.out.println(element.toString().substring(pos1,pos2));
			String xpath=element.toString().substring(pos1,pos2);
			WebDriverWait wait=new WebDriverWait(driver, timeout);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
			System.out.println("The element :"+elementname+" is Vanish sucessfully  on the page : "+pagename+" within the time "+timeout);
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
			System.out.println("The element :"+elementname+" is not vanished  on the page : "+pagename+" within the time "+timeout);
		}
		return status;
	}

}
