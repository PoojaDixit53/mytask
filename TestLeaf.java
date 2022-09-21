package com.aparinnosys.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) throws InterruptedException 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver Driver = new ChromeDriver();
			
			//To launch the Url
			Driver.get("http://leaftaps.com/opentaps/control/login");
			Driver.manage().window().maximize();
			Thread.sleep(5000);
			
			//To login
			Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			Driver.findElement(By.id("password")).sendKeys("crmsfa");
			Driver.findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(3000);
			
			//To click CRM/SFA
			Driver.findElement(By.xpath("// a [contains(text(),'CRM/SFA')]")).click();
			
			//To click Lead
			Driver.findElement(By.xpath("// a [contains(text(),'Leads')]")).click();
			
			//To click Create Lead
			Driver.findElement(By.xpath("// a [text()='Create Lead']")).click();
			
			//To Enter Details
			Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hcl");
			Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pooja");
			Driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Dixit");
			Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("pooja");
			Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Engineer");
			Driver.findElement(By.id("createLeadForm_description")).sendKeys("Am a Testing Engineer");
			Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pooja123@gmail.com");
			WebElement Testleaf = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select State =new Select(Testleaf);
			State.selectByVisibleText("California");
			Thread .sleep(3000);
			
			//To Sumbit
			Driver.findElement(By.name("submitButton")).click();
			
			//To Get Title
			String title = Driver.getTitle();
			System.out.println(title);
			Driver.close();		
		    
			

	}

}
