package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;
import Test_cases.Config_Reader;

public class UplaodFilePage {
	
	 WebDriver driver;
	Common_Methods cm= new Common_Methods();
	Config_Reader cnf= new  Config_Reader();
	
	public  UplaodFilePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
		
	public void uploadfile()
	{
	
		try
		{
			Robot rob = new Robot();
			for(int i=1; i<=2;i++)
			{
			cm.sleep(5000);	
			rob.keyPress(KeyEvent.VK_TAB);
			rob.keyRelease(KeyEvent.VK_TAB);
			}
			cm.sleep(5000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			cm.sleep(7000);
			Runtime.getRuntime().exec(cnf.exepath()+" "+cnf.uploadfilepath());			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
