package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/resizable");
		
	    driver.switchTo().frame(0);
	  
		
		
		WebElement frame = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions obj=new Actions(driver);
	
		obj.clickAndHold(frame).moveByOffset(10,70).release(frame).perform();

	}

}
