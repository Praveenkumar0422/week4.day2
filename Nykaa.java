package week4.day2;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nykaa.com/");
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions action=new Actions(driver);
		action.moveToElement(brand).perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		System.out.println(title);
	    driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();
	    driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	    driver.findElement(By.xpath("//span[text()='Category']")).click();
	    driver.findElement(By.xpath("//span[text()='Hair']")).click();
	    driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	    driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	    driver.findElement(By.xpath("//span[text()='Concern']")).click();
	    driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	    String text = driver.findElement(By.xpath("//div[@class='css-rtde4j']")).getText();
	    System.out.println("filters applied: " +text);
	    driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[1]")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String>window=new LinkedList<String>(windowHandles);
	    driver.switchTo().window(window.get(1));
	    		
	    WebElement size = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
	    Select obj=new Select(size);
	    obj.selectByVisibleText("175ml");
	    String text2 = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
	    System.out.println("MRP of the product: "+text2);
	    driver.findElement(By.xpath("(//span[text()='ADD TO BAG'])[1]")).click();
	    driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
	    driver.switchTo().frame(0);
	    String text3 = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
	    
	    System.out.println("Grand Total amount: " +text3);
	    
	    
	    driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
	    driver.findElement(By.xpath("//button[@class='btn full big']")).click();
	    String text4 = driver.findElement(By.xpath("(//div[@class='value'])[2]")).getText();
	    System.out.println("Grand Total amount: "+text4);
	   if(text4.equals(text3)) {
		   System.out.println("grand total is same");
	   }
	   else {
		System.out.println("grand total is not same");
	}
	    
	   
	    driver.quit();
	    
	
	    
	 
	    
		
	

	}

}
