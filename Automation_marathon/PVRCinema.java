package Automation_marathon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.pvrcinemas.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	    driver.findElement(By.id("cinema")).click();
	    Thread.sleep(2000);
	    //Select the theatre
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[2]")).click();
		Thread.sleep(2000);
		//select the movie name
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[2]/span[text()='Tomorrow']")).click();
		Thread.sleep(2000);
		//Select the date
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[2]/span[1]")).click();
		Thread.sleep(2000);
		//Select time
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[2]/span[1]")).click();
		//click book
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		//term_condi.accept()
		WebElement termcondi = driver.findElement(By.xpath("//button[text()='Accept']"));
		termcondi.click();
		//Alert term_condi = driver.switchTo().alert();
		Thread.sleep(2000);
		//selecting seat number
		driver.findElement(By.xpath("(//span[text()='17'])[3]")).click();
		Thread.sleep(2000);
		//Getting seat info
		String seatinfo =driver.findElement(By.className("seat-info")).getText();
		System.out.println("-----------");
		System.out.println(seatinfo);
		System.out.println("-----------");
		//Getting the grand total while booking seat
		String grandtotalseat= driver.findElement(By.className("grand-prices")).getText();
		System.out.println("----grandTotal at seat booking-------");
		System.out.println(grandtotalseat);
		System.out.println("-----------");
		//click proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Getting the grand total after snacks add on
		String grandtotalseatSna= driver.findElement(By.className("grand-prices")).getText();
		System.out.println("----grandTotal at seat booking after snack section-------");
		System.out.println(grandtotalseatSna);
		System.out.println("-----------");
		Thread.sleep(2000);
		if(grandtotalseat.equals(grandtotalseatSna)) 
		{
			System.out.println("No changes in the grant total and same amount is carried on");
		}
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		//close the close popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		// get the title
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println("Current page title: " + title);		
		driver.quit();
		
		
	}

}
