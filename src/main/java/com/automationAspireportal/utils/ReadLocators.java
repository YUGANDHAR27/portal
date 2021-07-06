package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.constants.FilePathConstants;

public class ReadLocators {
	File file = new File(FilePathConstants.CONFIG_FILE);
	File file1 = new File(FilePathConstants.ASPIREPORTAL_locators);

	FileInputStream inputstream = null;
	FileInputStream inputstream1 = null;
	Properties property = null;

	public ReadLocators() {
		try {
			inputstream = new FileInputStream(file);
			inputstream1 = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(inputstream);
			property.load(inputstream1);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String Url() {
		return property.getProperty("Dashboard_URL");

	}

	public String emailPath() {
		return property.getProperty("Loc.mailpath.input");

	}

	public String passwordPath() {
		return property.getProperty("Loc.passwordpath.input");

	}

	public String clickOnLogin() {
		return property.getProperty("Loc.login.btn");

	}
/*
	public String clickonTimesheet() {
		return property.getProperty("Loc.Timesheet.txt");
	}

	public String slectActivity() {
		return property.getProperty("Loc.selectActivity.dropdown");
	}

	public String activity() {
		return property.getProperty("Loc.activity.txt");

	}

	public String clickonMonday() {
		return property.getProperty("Loc.monday.txt");

	}

	public String clickonTuesday() {
		return property.getProperty("Loc.tuesday.txt");

	}

	public String clickonwednesday() {
		return property.getProperty("Loc.wednesday.txt");

	}

	public String clickonThursday() {
		return property.getProperty("Loc.thursday.txt");
	}

	public String clickonFriday() {
		return property.getProperty("Loc.friday.txt");

	}

	public String clickonNotes() {
		return property.getProperty("Loc.notes.btn");
	}

	public String giveNotes() {
		return property.getProperty("Loc.givenotes.txt");
	}

	public String clickcheck() {
		return property.getProperty("Loc.clickoncheck.btn");

	}

	public String clickonAddactivity() {
		return property.getProperty("Loc.addactivity.btn");

	}

	public String selectactivity1() {
		return property.getProperty("Loc.selectactivity1.dropdown");
	}

	public String activity2() {
		return property.getProperty("Loc.activity1.txt");
	}

	public String deleteactivity() {
		return property.getProperty("Loc.delete.btn");
	}
	public String saveTimesheet() {
		return property.getProperty("Loc.save.btn");
	}
	public String saveOk() 
	{
		return property.getProperty("Loc.ok.btn");
	}
	public String submit() {
		return property.getProperty("Loc.submit.btn");
	}
*/

	public String clickontimesheet() 
	{
		return property.getProperty("Loc.timesheet.txt");
	}
		
	}
