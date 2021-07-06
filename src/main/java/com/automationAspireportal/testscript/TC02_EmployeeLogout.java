package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadEmployeeModuleLocators;

public class TC02_EmployeeLogout extends TestsuiteBase
{
	ReadEmployeeModuleLocators read=new ReadEmployeeModuleLocators();
	public TC02_EmployeeLogout(WebDriver driver)
	{
		this.driver=driver;
	}
	public void logout() 
	{
		employeeLogin login=new employeeLogin(driver);
		login.employeelogin();
		String logout=read.logoutempl();
		String clickonlogout=read.out();
		WebElement log=driver.findElement(By.xpath(logout));
		log.click();
		WebElement clicklogout=driver.findElement(By.xpath(clickonlogout));
		clicklogout.click();
		}

}
