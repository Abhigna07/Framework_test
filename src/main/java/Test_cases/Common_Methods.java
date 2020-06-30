package Test_cases;

import java.io.File;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import sun.net.www.protocol.http.HttpURLConnection;

public class Common_Methods {
	
	Config_Reader cnf= new Config_Reader();
	
	public void sleep(long milsec)
	{
		try {
		Thread.sleep(milsec);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	
	public void getScreenshot(WebDriver driver,String filename )
	
	{
		try {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Random ran = new Random();
		
		String fil= cnf.screenshotpath();
		
		String path= fil+filename+ran.nextInt()+".png";
		
		Files.copy(source,new File(path));
		
		System.out.println("File copied in path" + path);
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
	}
	
	
	public void brokenLink(String url)
	{
		try {
		URL link = new URL(url);
		HttpURLConnection httpconn= (HttpURLConnection)link.openConnection();
		sleep(3000);
		httpconn.connect();
		int respcode=httpconn.getResponseCode();
		
		if(respcode>=400)
		{
			
			System.out.println(url+" Link is broken");
			
		}
		
		else
		{
			System.out.println(url+" Link is not broken");
			
		}
		
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
		
	}
	
	public void brokenImage(WebElement image)
	{
		
		if (image.getAttribute("naturalWidth").equals("0"))
	    {
	        System.out.println(image.getAttribute("outerHTML") + " is broken.");
	    }
		
		else
		{
			 System.out.println(image.getAttribute("outerHTML") + " is not broken.");
			
		}
		
	}
	
	public void mouseclick(WebDriver driver, WebElement target )
	{
		
		Actions act= new Actions(driver);
		act.click(target).perform();
		act.build();
		
	}
	
	public void waitforwindows(WebDriver driver, int count)
	{
		
		WebDriverWait wait= new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.numberOfWindowsToBe(count));
		
	}
	
	public void draganddropby(WebDriver driver, WebElement ele,int xOffset,int yOffset)
	{
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(ele, xOffset, yOffset).perform();
		act.build();
	}
	
	public void draganddrop(WebDriver driver, WebElement src,WebElement trg)
	{
		
		Actions act= new Actions(driver);
		act.dragAndDrop(src,trg).perform();
		act.build();
		
	}
	
	public void File_Check(String path)
	{
		
		File fil = new File(path);
		
		if(fil.exists())
		{
			
			System.out.println("File exists in path : "+path);
		}
		
		else
		{
			
			System.out.println("File doesn't exists in path : "+path);
		}
				
	}
	
	public void Waitforpresenceofelemet(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver,10); 
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public void alertcheck(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public void hoveronelement(WebDriver driver, WebElement trg)
	{
		
		Actions act= new Actions(driver);
		act.moveToElement(trg).perform();
		act.build();
	}

}
