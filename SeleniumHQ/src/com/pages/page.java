package com.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class page 
{
	WebDriver driver;
	By Downloads=By.xpath("//*[@id=\"navbar\"]/a[1]");
	By IEDriver=By.xpath("/html/body/div[2]/div[2]/p/a[2]");

	public page(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void Downloads()
	 {
		 driver.findElement(Downloads).click();
		 
	 }
	 public void IEDriver() throws InterruptedException
	 {
		 driver.findElement(IEDriver).click();
		 Thread.sleep(4000);
		 File f=new File("C:\\Users\\Ramya\\Downloads\\IEDriverServer_x64_3.150.1 (1).zip.crdownload");
		 Boolean b=f.exists();
		 if(b)
		 System.out.println("file Exist");
		 Assert.assertTrue(b);
	 }
}


