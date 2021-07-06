package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automationAspireportal.constants.FilePathConstants;

public class Readmanagermodulelocators
{
	File file=new File(FilePathConstants.managertimesheet_locators);
	FileInputStream fis=null;
	Properties prop=null;
	public Readmanagermodulelocators()
	{
		try {
			fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String clickoncheckbox() 
	{
		return prop.getProperty("Loc.selectemployee.checkbox");
	}
	public String clickonreject()
	{
		return prop.getProperty("Loc.reject.btn");
		
	}
	public String entercomment()
	{
		return prop.getProperty("Loc.comment.txt");
	}
	public String reject() 
	{
		return prop.getProperty("Loc.reject1.btn");
	}
	//public String rejectaction() 
	//{
		//return prop.getProperty("Loc.rejectaction.btn");
	//}
	public String clickonshifts()
	{
		return prop.getProperty("Loc.shifts.txt");
		
		
	}
	public String clickonselectproject() {
		return prop.getProperty("Loc.selectproject.txtbox");
	}
	public String clickpro() {
		return prop.getProperty("Loc.pro.txt");
	}
	public String project() 
	{
	return prop.getProperty("Loc.project.txt");
			
	
		
	
	}
	
    
	
	
}
