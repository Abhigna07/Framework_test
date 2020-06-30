package Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class AdvancedWebTablePage {
	
WebDriver driver;
	
    Common_Methods cm= new Common_Methods();
	
	public  AdvancedWebTablePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//table[@id='table_id']/tbody[1]/tr")
	private List<WebElement> rows;
	@FindBy(how=How.XPATH,using="//table[@id='table_id']/thead[1]/tr[1]/th[2]")
	WebElement Name_col;
	
	public void check_sort()
	{
		
	int count_rows=rows.size();
	ArrayList<String> list= new ArrayList<String>();
	ArrayList<String> list1= new ArrayList<String>();
	
	for(int i=1;i<=count_rows;i++)
		
	{
		WebElement ele=driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+i+"]/td[2]"));
		list.add(ele.getText());						
	}
	
     Collections.sort(list);
     System.out.println(list);
     Name_col.click();
     cm.sleep(5000);
     for(int i=1;i<=count_rows;i++)
 		
 	{
 		WebElement ele=driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+i+"]/td[2]"));
 		list1.add(ele.getText());						
 	}
     
     System.out.println(list1);
     
     if(list.equals(list1))
    	 
     {
    	 System.out.println("Sorted");
    	 
     }
     
     else
     {
    	 
    	 System.out.println("Not Sorted");
     }
     
	}

}
