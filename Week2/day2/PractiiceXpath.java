package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiiceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        //attribute based xpath
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
        //attribute based on text
        WebElement FBname =driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
        String facname = FBname.getText();
        System.out.println(facname);
        //

}
}
