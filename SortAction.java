package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leafground.com/pages/sortable.html");
	    WebElement item1 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
		WebElement item2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[2]"));
		WebElement item3 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[3]"));
		WebElement item4 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[4]"));
		WebElement item5 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[5]"));
		WebElement item6 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[6]"));
		WebElement item7 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[7]"));
		Actions obj=new Actions(driver);
		obj.clickAndHold(item7).moveToElement(item1).release(item1).clickAndHold(item5).moveToElement(item2).release(item2).perform();
		
		
		
	}

}
