package Pages;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;
import Test_cases.Config_Reader;

public class DownloadPage {
	
	  WebDriver driver;
		
		Common_Methods cm= new Common_Methods();
	    Config_Reader cnf= new  Config_Reader();
			
			public  DownloadPage(WebDriver driver)
			{
				this.driver=driver;
				
			}
			
			@FindBy(how=How.LINK_TEXT,using="Download Excel")
			private WebElement Excel_btn;
            @FindBy(how=How.LINK_TEXT,using="Download PDF")
			private WebElement PDF_btn;
            @FindBy(how=How.LINK_TEXT,using="Download Text")
        	private WebElement Text_btn;
			
			public void Excel_download()
			{
				cm.sleep(5000);
				Excel_btn.click();
				cm.sleep(5000);
				cm.File_Check(cnf.exceldownloadpath());
				
			}
			
			public void pdf_download()
			{
				cm.sleep(5000);
				PDF_btn.click();
				
				try
				{
				Robot rob= new Robot();
				
				for(int i=1; i<=3;i++)
				{
				cm.sleep(3000);	
				rob.keyPress(KeyEvent.VK_TAB);
				rob.keyRelease(KeyEvent.VK_TAB);
				}
				
				rob.keyPress(KeyEvent.VK_ENTER);
				
				for(int i=1; i<=3;i++)
				{
				cm.sleep(3000);	
				rob.keyPress(KeyEvent.VK_TAB);
				rob.keyRelease(KeyEvent.VK_TAB);
				}
				
				rob.keyPress(KeyEvent.VK_ENTER);
				cm.sleep(5000);
				cm.File_Check(cnf.pdfdownloadpath());
				
				}
				
				catch(Exception e)
				{
					System.out.println(e);
					
				}
				
				driver.navigate().back();
				
			}
			
			public void text_download()
			{
				cm.sleep(3000);
				Text_btn.click();
				
			}

}
