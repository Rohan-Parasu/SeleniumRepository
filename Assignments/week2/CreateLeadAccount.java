package Assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAccount {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		//URL launch
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(2000);
		//browser window maximized
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    Thread.sleep(2000);
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		//click login button
		driver.findElement(By.xpath("//input[@value ='Login']")).click();
		Thread.sleep(2000);
		//click CRMsfa link to navigate to testleaf crm page
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		//select leads tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Thread.sleep(2000);
		//click create lead button
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MSC");
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rohan");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Parasu");
		//Enter title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing Executive");
		//Click create lead button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//get the title
		Thread.sleep(2000);
		String LeadTitle= driver.getTitle();
		System.out.println(LeadTitle);
		Thread.sleep(2000);
		driver.close();
	}

}
