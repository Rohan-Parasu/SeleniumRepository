package Automation_marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		//Get the total bag counts
		String totalnumbers = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(totalnumbers);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Skybags")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Safari")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(2000);
		String discount= driver.findElement(By.xpath("(//div[@class='a-row'])[2]")).getText();
		System.out.println(discount);
		Thread.sleep(2000);
		String amatitle= driver.getTitle();
		System.out.println(amatitle);
		Thread.sleep(2000);
		driver.quit();

	}

}
