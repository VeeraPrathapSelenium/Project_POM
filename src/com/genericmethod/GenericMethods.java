package com.genericmethod;

import org.openqa.selenium.WebElement;

public class GenericMethods {

	/**
	 @name:IsDisplayed
	 @Purpose:This method is used for is Element successfully displayed on the application
	 @Input:WebElement element,String elementname,String Pagename
	 @Output:boolean
	 @author:ranjith
	 @DesignDate:06/26/2019
	 **/
	
	public boolean IsDisplayed(WebElement element,String elementname,String Pagename)
	{
		boolean status = true;
		
		try
		{
			boolean isDisplayeStatus = element.isDisplayed();
			if(isDisplayeStatus)
			{
				System.out.println("The element"+elementname+ "is successfully displayed on page"+Pagename);
			}
			else
			{
				System.out.println("The element"+elementname+ "is not successfully displayed on page"+Pagename);
				System.out.println("unable to find the element"+elementname);
				status=false;
			}
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
			
		}
		return status;
	}
}
