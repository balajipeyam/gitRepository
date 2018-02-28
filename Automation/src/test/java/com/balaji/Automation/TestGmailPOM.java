package com.balaji.Automation;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.balaji.listeners.UIListener;

public class TestGmailPOM {
	@Test
	public void testGmailPOM() {
		GmailPOM gpom = new GmailPOM(UIListener.uidriver.get()).enterWithUserID("balajipeyam")
				.enterWithPassword("samilih3010");
		
	}
	
	public static void main(String args[])
	{
		String a= "balaji";
		
		System.out.println(a.length());
		
		char[] str=a.toCharArray();
		
		
		
			
		
		
	}}