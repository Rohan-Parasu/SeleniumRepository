package Assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createaccount {

	public static void main(String[] args) throws InterruptedException {
		
		//driver initialize
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
		//select accounts tab
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		Thread.sleep(2000);
		//click create account 
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		Thread.sleep(2000);
		//enter the account name
		driver.findElement(By.id("accountName")).sendKeys("Rohan Parasu");
		Thread.sleep(2000);
		//enter description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		Thread.sleep(2000);
		//enter no.of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("21");
		Thread.sleep(2000);
		//enter site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		Thread.sleep(2000);
		//Click create button
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}

}
