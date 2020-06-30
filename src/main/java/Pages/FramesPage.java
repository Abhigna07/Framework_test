package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class FramesPage {
	
	WebDriver driver;
	
	
Common_Methods cm= new Common_Methods();
	
	public  FramesPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID,using="Click")
	private WebElement Click_btn;
	@FindBy(how=How.ID,using="Click1")
	private WebElement Click1_btn;
	@FindBy(how=How.TAG_NAME,using="iframe")
	private List<WebElement> frames_cnt;

	public void frame1()
	{
		
		driver.switchTo().frame(0);
		cm.sleep(2000);
		Click_btn.click();
		cm.sleep(2000);
		System.out.println(Click_btn.getText());
		driver.switchTo().defaultContent();
		
	}
	
	public void Nestedframe()
	{
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		Click1_btn.click();
		System.out.println(Click1_btn.getText());
		driver.switchTo().defaultContent();
	}
	
	public void numberofframes()
	{
		
		System.out.println("Number of frames are : "+frames_cnt.size());
		
	}
	

}
