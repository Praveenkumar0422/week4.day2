package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.findElement(By.id("table_id"));
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int size = row.size();

		System.out.println(size);
		WebElement rowval = row.get(1);
		List<String>lst=new ArrayList<String>();
		List<WebElement> column = rowval.findElements(By.tagName("td"));
		int size2 = column.size();
		System.out.println(size2);
		for (int i = 1; i < size; i++) {
			WebElement col = row.get(i);
			List<WebElement> colval = col.findElements(By.tagName("td"));
			String text = colval.get(1).getText();
			lst.add(text);
			
			
			}
		 System.out.println("before sort "+lst);
		   Collections.sort(lst);
		   System.out.println("after sort "+lst);
		   driver.findElement(By.xpath("//th[text()='Name']")).click();
		   List<WebElement> findElements2 = driver.findElements(By.tagName("tr"));
		   int size4 = findElements2.size();
		   System.out.println(size4);
		   List<String>lst1=new ArrayList<String>();
		   WebElement row2 = findElements2.get(1);
		   List<WebElement> coll2 = row2.findElements(By.tagName("td"));
		   int size3 = coll2.size();
		   System.out.println(size3);
		   for (int j = 1; j < size4; j++) {
			   WebElement webElement = findElements2.get(j);
			   List<WebElement> findElements = webElement.findElements(By.tagName("td"));
			   String text1 = findElements.get(1).getText();
			   
			   lst1.add(text1);
			
		}
		   System.out.println(lst1);
		  if (lst.equals(lst1)) {
			  System.out.println("is true");
			
		}else
		 
		{
			System.out.println("is not true");
		}
		  
		   
		
		   
   

	  
		
		
		
		
		
	}

}
