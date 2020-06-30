package Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class TablePage {
	
	WebDriver driver;
	
    Common_Methods cm= new Common_Methods();
	
	public  TablePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//table[@id='table_id']/tbody[1]/tr[1]/th")
	private List <WebElement> columns;
	@FindBy(how=How.XPATH,using="//table[@id='table_id']/tbody[1]/tr")
	private List<WebElement> rows;
	
	public int count_rows()
	{
		
		int row=rows.size();
		
		//System.out.println("No:of rows are : "+row);
		
		return row;
	}
	
	public int count_cols()
	{
		
		int col=columns.size();
		//System.out.println("No:of columns are : "+col);
		return col;
	}
	
	
	public void progress()
	{
		ArrayList<String> list= new ArrayList<String>();
		
		for(int i=2;i<=count_rows();i++)
			
		{
			WebElement ele=driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+i+"]/td[1]"));
			
			list.add(ele.getText());				
			
		}
		
		int idx=list.indexOf("Learn to interact with Elements");
		int i=idx+2;
		WebElement ele=driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+i+"]/td[2]"));
		String text=ele.getText();
		System.out.println("Progress value is : "+text);
		cm.sleep(3000);
	}
	
	public void maxvalue()
	{
		
      ArrayList<Integer> list= new ArrayList<Integer>();
     
		
		for(int i=2;i<=count_rows();i++)
			
		{
			String ele=driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+i+"]/td[2]")).getText();
		 
			  String[] arrSplit = ele.split("%");
			  
			    for (int j=0; j < arrSplit.length; j++)
			    {
			      String s=arrSplit[j];
			      int Intz=Integer.parseInt(s);
			      list.add(Intz);
			    }	
			    			  
		  			}
		
		  System.out.println(list);
		  int min_val=Collections.min(list);
		  System.out.println("Minium value is : "+min_val);
		  int indx=list.indexOf(min_val);
		  System.out.println(indx);
		  int sel=indx+2;
		  cm.sleep(3000);
          driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+sel+"]/td[3]/input[1]")).click();
          cm.sleep(3000);		
	}
	
	public void PrintTable()
	{
	    HashMap<Integer,String> list= new HashMap<Integer,String>();
		
		for(int i=2;i<=count_rows();i++)
		{
			
			for(int j=1;j<=count_cols();j++)
			{
				
				String ele=driver.findElement(By.xpath("//table[@id='table_id']/tbody[1]/tr["+i+"]/td["+j+"]")).getText();
				list.put(j, ele);
			
			}
			
			System.out.println(list);	

		}
		
	
		
	}

}
