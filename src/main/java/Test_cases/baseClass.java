package Test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
	WebDriver driver;
    Config_Reader cnf= new  Config_Reader();
	
  @BeforeMethod
  public void setUp() {
	  
	
	  
	  System.setProperty("webdriver.chrome.driver", cnf.Chromepath());
	  driver= new ChromeDriver();
	  driver.get(cnf.URL());
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	  
  }
  
  @AfterMethod
  
  public void TearDown() throws InterruptedException
  {
	
	Thread.sleep(3000);;  
    driver.quit();
	  
  }
}
