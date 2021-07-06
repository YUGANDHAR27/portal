package com.automationAspireportal.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Readmanagermodulelocators;

public class TC01_ManagerPage extends TestsuiteBase {
	Readmanagermodulelocators read = null;

	public TC01_ManagerPage(WebDriver driver) {
		this.driver = driver;
		read = new Readmanagermodulelocators();
	}

	public void managertimesheetmodule() {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		String clickcheckbox = read.clickoncheckbox();
		String clickreject = read.clickonreject();
		String givecomment = read.entercomment();
		String clickonreject=read.reject();
		//String actionreject = read.rejectaction();
	   		// click on reject
		 WebElement selectemployee = driver.findElement(By.xpath(clickcheckbox));
		  selectemployee.click();
		 WebElement reject=driver.findElement(By.xpath(clickreject));
		 reject.click();
	//	WebElement performreject = driver.findElement(By.xpath(actionreject));
		//performreject.click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement comment = driver.findElement(By.xpath(givecomment));
		comment.sendKeys("thank you");
		WebElement rejectclick = driver.findElement(By.xpath(clickonreject));
		rejectclick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				

		
	}

}
