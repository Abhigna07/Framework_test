package Test_cases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
	
	Properties pro;
	
	public Config_Reader()
	{
		try {
		File src = new File("C:\\Users\\abhig\\eclipse-workspace\\Maven_test\\config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}
		
		catch(Exception e)
		{
			
			System.out.println("Error is + "+e);
		}
				
	}
	
	
	public String URL()
	{		
		String sys_url=pro.getProperty("url");
		return sys_url;		
	}
	
	public String Chromepath()
	{		
		String driver_chr=pro.getProperty("chromedriver");
		return driver_chr;		
	}
	
	public String screenshotpath()
	
	{
		
		String scrpath=pro.getProperty("Screenshotpath");
		return scrpath;
	}
	
	public String exceldownloadpath()
	{
		String exlpath=pro.getProperty("Excelpath");
		return exlpath;
	}
	
	public String pdfdownloadpath()
	{
		String pdfpath=pro.getProperty("PDFPath");
		return pdfpath;
	}
	
	public String exepath()
	{
		String exefile=pro.getProperty("exepath");
		return exefile;
		
	}
	
	public String uploadfilepath()
	{
		String file=pro.getProperty("uploadpath");
		return file;		
	}

}
