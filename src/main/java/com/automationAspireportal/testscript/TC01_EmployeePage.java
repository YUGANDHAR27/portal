package com.automationAspireportal.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadEmployeeModuleLocators;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;

public class TC01_EmployeePage extends TestsuiteBase {
	ReadExcel excel;
	ReadEmployeeModuleLocators reademp;

	public TC01_EmployeePage(WebDriver driver) {
		this.driver = driver;
		excel = new ReadExcel(0);
		reademp = new ReadEmployeeModuleLocators();

	}

	public void employeeModule(WebDriver driver) {
		employeeLogin loginin = new employeeLogin(driver);
		loginin.employeelogin();
		String clickonSelectactivity = reademp.slectActivity();
		String activity1 = reademp.activity();
		String monday = reademp.clickonMonday();
		String mwh = excel.mondayWorkinghour();
		String tuesday = reademp.clickonTuesday();
		String twh = excel.tuesdayWorkinghour();
		String wednesday = reademp.clickonwednesday();
		String wwh = excel.wednesdayWorkinghour();
		String thursday = reademp.clickonThursday();
		String thwh = excel.thursdayWorkinghour();
		String friday = reademp.clickonFriday();
		String fwh = excel.fridayWorkinghour();
		String clickonNotes = reademp.clickonNotes();
		String enterNotes = reademp.giveNotes();
		String clickonCheck = reademp.clickcheck();
		String addactivity = reademp.clickonAddactivity();
		String clickonSelectactivity1 = reademp.selectactivity1();
		String activity2 = reademp.activity2();
		String deleteActivity = reademp.deleteactivity();
		String save = reademp.saveTimesheet();
		String saveok = reademp.saveOk();
		String clickonsubmit = reademp.submit();
		// String submit1=reademp.submit();

		WebElement act = driver.findElement(By.xpath(clickonSelectactivity));
		act.click();
		WebElement selectact = driver.findElement(By.xpath(activity1));
		selectact.click();
		WebElement clickonmonday = driver.findElement(By.xpath(monday));
		clickonmonday.sendKeys(mwh);
		WebElement entertuesdayWh = driver.findElement(By.xpath(tuesday));
		entertuesdayWh.sendKeys(twh);
		WebElement enterwednesdayWh = driver.findElement(By.xpath(wednesday));
		enterwednesdayWh.sendKeys(wwh);
		WebElement eneterthursadyWh = driver.findElement(By.xpath(thursday));
		eneterthursadyWh.sendKeys(thwh);
		WebElement enterfridayWh = driver.findElement(By.xpath(friday));
		enterfridayWh.sendKeys(fwh);
		WebElement enternotes = driver.findElement(By.xpath(clickonNotes));
		enternotes.click();
		// enternotes.sendKeys("hii sir");
		WebElement enternotes1 = driver.findElement(By.xpath(enterNotes));
		enternotes1.sendKeys("Thank you Sir");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement clickoncheck = driver.findElement(By.xpath(clickonCheck));
		clickoncheck.click();
		WebElement clickaddactivity = driver.findElement(By.xpath(addactivity));
		clickaddactivity.click();
		WebElement selectactivity11 = driver.findElement(By.xpath(clickonSelectactivity1));
		selectactivity11.click();
		WebElement activity22 = driver.findElement(By.xpath(activity2));
		activity22.click();
		WebElement delete = driver.findElement(By.xpath(deleteActivity));
		delete.click();
		WebElement savetemployeeTs = driver.findElement(By.xpath(save));
		savetemployeeTs.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebElement clickonOk=driver.findElement(By.xpath(saveok));
		// clickonOk.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.xpath(clickonsubmit));
		submit.click();
		System.out.println("sumitted successfully");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement harshit = driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[2]/li[1]/a[1]"));
		harshit.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		/*
		 * Thread.sleep(2000); WebElement submit2=driver.findElement(By.xpath(submit1));
		 * submit2.click();
		 */

	}

}
