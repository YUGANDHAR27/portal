package com.automationAspireportal.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Readmanagermodulelocators;

public class TC02_MangershiftsPage extends TestsuiteBase {
	Readmanagermodulelocators read = new Readmanagermodulelocators();

	public TC02_MangershiftsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void updatingshifts(){
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		String shifts = read.clickonshifts();
		String selectproject = read.clickonselectproject();
		String enterproject=read.project();
		String propo=read.clickpro()
;		WebElement clickshifts = driver.findElement(By.xpath(shifts));
		clickshifts.click();
		WebElement clickontextbox = driver.findElement(By.xpath(selectproject));
		clickontextbox.click();
		WebElement clickon=driver.findElement(By.xpath(propo));
		clickon.sendKeys("Hyper Loop-Hyper Loop");
		clickon.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement giveproject=driver.findElement(By.xpath(enterproject));
		//giveproject.click();
		
	///Select objslct=new Select(giveproject);
	//	objslct.
		
		
		
	}

}
