package Assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateaccountWithdropdown {

	static String accountname ="RohanParasu1";
	public static void main(String[] args) throws Exception {
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
				driver.findElement(By.id("accountName")).sendKeys(accountname);
				
				Thread.sleep(2000);
				//enter description
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
				Thread.sleep(2000);
				//select industry
				WebElement	industry =driver.findElement(By.name("industryEnumId"));
				Select indust = new Select(industry);
				indust.selectByVisibleText("Computer Software");
				WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
				Select ownersh = new Select(ownership);
				ownersh.selectByVisibleText("S-Corporation");
				WebElement source = driver.findElement(By.id("dataSourceId"));
				Select sorc = new Select(source);
				sorc.selectByValue("LEAD_EMPLOYEE");
				WebElement marketCamping = driver .findElement(By.id("marketingCampaignId"));
				Select marketcamp = new Select(marketCamping);
				marketcamp.selectByIndex(6);
				Thread.sleep(2000);
				WebElement stateProvinced = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
				Select stateP = new Select(stateProvinced);
				stateP.selectByValue("TX");
				
				
				
				//Click create button
				driver.findElement(By.className("smallSubmit")).click();
				Thread.sleep(2000);
				String accountafsave =driver.findElement(By.xpath("(//span[text()='Account Name']/following::span)[1]")).getText();
				if(accountname.equals(accountafsave)) 
				{
					System.out.println("Correct");
				}
				driver.close();

	}

}
