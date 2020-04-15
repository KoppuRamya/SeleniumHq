package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.WrapperEx;
import com.pages.page;

public class Testcase extends WrapperEx
{

	@BeforeClass
	public void startup()
	{
		Launchapp("chrome","https://www.seleniumhq.org");
	}
	@Test
	public void Search() throws InterruptedException
	{
		page sp = new page(driver);
		sp.Downloads();
		sp.IEDriver();
	}
	@AfterClass
	public void close() throws IOException, InterruptedException
	{
		screenshot("SeleniumHQ/Screenshots/screenshot1.png");
		CloseBrowser();
	}


}
