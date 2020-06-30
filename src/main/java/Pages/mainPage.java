package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage {
	
	WebDriver driver;
	
	public mainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH,using="//a[@href='pages/Edit.html']")
	private WebElement Edit_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Button.html']")
	private WebElement Button_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Link.html']")
	private WebElement HyperLink_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Image.html']")
	private WebElement Image_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Dropdown.html']")
	private WebElement DropDown_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/radio.html']")
	private WebElement Radio_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/checkbox.html']")
	private WebElement Checkbox_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/table.html']")
	private WebElement Table_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Alert.html']")
	private WebElement Alert_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/frame.html']")
	private WebElement Frame_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Window.html']")
	private WebElement Window_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/Calendar.html']")
	private WebElement Calender_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/drag.html']")
	private WebElement Draggable_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/drop.html']")
	private WebElement Droppable_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/selectable.html']")
	private WebElement Selectable_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/sortable.html']")
	private WebElement Sortable_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/autoComplete.html']")
	private WebElement AutoComplete_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/download.html']")
	private WebElement DownloadFiles_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/upload.html']")
	private WebElement UplaodFiles_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/tooltip.html']")
	private WebElement ToolTip_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/disapper.html']")
	private WebElement Disappear_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/appear.html']")
	private WebElement appear_btn;
	@FindBy(how=How.XPATH,using="//a[@href='pages/TextChange.html']")
	private WebElement textchange_btn; 
	@FindBy(how=How.XPATH,using="//a[@href='pages/alertappear.html']")
	private WebElement waitforalert_btn; 
	@FindBy(how=How.XPATH,using="//a[@href='pages/mouseOver.html']")
	private WebElement mousehover_btn; 
	@FindBy(how=How.XPATH,using="//a[@href='pages/sorttable.html']")
	private WebElement advwebtable_btn; 
	
	public WebElement mainpage_hyperlink()
	{
		
		return HyperLink_btn;
	}
	
	public void click_Edit()
	{
		
		Edit_btn.click();
	}

	public void click_Button()
	{
		
		Button_btn.click();
	}
	
	public void click_HyperLink()
	{
		
		HyperLink_btn.click();
	}

	public void click_Image()
	{
		
		Image_btn.click();
	}
	
	public void click_DropDown()
	{
		
		DropDown_btn.click();
	}
	
	public void click_RadioButton()
	{
		
		Radio_btn.click();
	}
	
	public void click_CheckBox()
	{
		
		Checkbox_btn.click();
	}
	
	public void click_Table()
	{
		
		Table_btn.click();
	}
	
	public void click_Alert()
	{
		
		Alert_btn.click();
	}
	
	public void click_Frame()
	{
		
		Frame_btn.click();
	}
	
	public void click_Window()
	{
		
		Window_btn.click();
	}
	
	public void click_Calender()
	{
		
		Calender_btn.click();
	}
	
	public void click_Draggable()
	{
		
		Draggable_btn.click();
	}
	
	public void click_Droppable()
	{
		
		Droppable_btn.click();
	}
	public void click_Selectable()
	{
		
		Selectable_btn.click();
	}
	
	public void click_Sortable()
	{
		
		Sortable_btn.click();
	}
	
	public void click_AutoComplete()
	{
		
		AutoComplete_btn.click();
	}
	
	public void click_DownlaodFiles()
	{
		
		DownloadFiles_btn.click();
	}
	
	public void click_UplaodFiles()
	{
		
		UplaodFiles_btn.click();
	}
	
	public void click_ToolTip()
	{
		
		ToolTip_btn.click();
	}
	public void click_WaitToDisappear()
	{
		
		Disappear_btn.click();
	}
	
	public void click_WaitToappear()
	{
		
		appear_btn.click();
	}
	
	public void click_WaitForTextChange()
	{
		
		textchange_btn.click();
	}
	public void click_WaitForAlert()
	{
		
		waitforalert_btn.click();
	}
	public void click_MouseHover()
	{
		
		mousehover_btn.click();
	}
	
	public void click_AdvanceWebTable()
	{
		
		advwebtable_btn.click();
	}
}
