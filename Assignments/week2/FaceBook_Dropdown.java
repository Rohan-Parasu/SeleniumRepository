package Assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //enter first name
        driver.findElement(By.name("firstname")).sendKeys("rohan");
        //enter last name
        driver.findElement(By.name("lastname")).sendKeys("parasu");
        //enter email
        driver.findElement(By.name("reg_email__")).sendKeys("rohanparasu@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rohanparasu@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("rohan@#123");
        Thread.sleep(2000);
        WebElement birth_date =driver.findElement(By.id("day"));
        Select date = new Select(birth_date);
        date.selectByVisibleText("21");
        WebElement birth_month =driver.findElement(By.id("month"));
        Select month = new Select(birth_month);
        month.selectByVisibleText("May");
        WebElement birth_year =driver.findElement(By.id("year"));
        Select year = new Select(birth_year);
        year.selectByVisibleText("1997");
        Thread.sleep(2000);
        // select the gender
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.quit();
        
        
        

	}

}
