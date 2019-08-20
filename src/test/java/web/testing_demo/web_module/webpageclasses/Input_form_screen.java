package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class Input_form_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":89,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":391,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Input_form_demo\",\"testcase_id\":563,\"testset_id\":0,\"executed_timestamp\":-1384559724,\"browser_type\":\"chrome,mozilla\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Input_form_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='first_name']")	
	private WebElement	FirstName_398833input;
	public void fillinputFirstName_398833(String varInputValue) {
		waitForExpectedElement(driver, FirstName_398833input);
		FirstName_398833input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='last_name']")	
	private WebElement	LastName_398794input;
	public void fillinputLastName_398794(String varInputValue) {
		waitForExpectedElement(driver, LastName_398794input);
		LastName_398794input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='email']")	
	private WebElement	EMailAddress_398838input;
	public void fillinputEMailAddress_398838(String varInputValue) {
		waitForExpectedElement(driver, EMailAddress_398838input);
		EMailAddress_398838input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='phone']")	
	private WebElement	_398877input;
	public void fillinput_398877(String varInputValue) {
		waitForExpectedElement(driver, _398877input);
		_398877input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='address']")	
	private WebElement	Address_398875input;
	public void fillinputAddress_398875(String varInputValue) {
		waitForExpectedElement(driver, Address_398875input);
		Address_398875input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='city']")	
	private WebElement	City_398741input;
	public void fillinputCity_398741(String varInputValue) {
		waitForExpectedElement(driver, City_398741input);
		City_398741input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//select[@name='state']")	
	private WebElement	State7_398736select;
	public String clkselectState7_398736() {
		waitForExpectedElement(driver, State7_398736select);		
		Select selectOption = new Select(State7_398736select);
		selectOption.selectByValue("Indiana");
		String text = selectOption.getFirstSelectedOption().getText();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='zip']")	
	private WebElement	ZipCode_398744input;
	public void fillinputZipCode_398744(String varInputValue) {
		waitForExpectedElement(driver, ZipCode_398744input);
		ZipCode_398744input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='website']")	
	private WebElement	WebsiteOrDomainName_398749input;
	public void fillinputWebsiteOrDomainName_398749(String varInputValue) {
		waitForExpectedElement(driver, WebsiteOrDomainName_398749input);
		WebsiteOrDomainName_398749input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'No')]")	
	private WebElement	No_398788label;
	public String textlabelNo_398788() {
		waitForExpectedElement(driver, No_398788label);		
		String text = No_398788label.getText();
		No_398788label.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//textarea[@name='comment']")	
	private WebElement	ProjectDescription_398779textarea;
	public void filltextareaProjectDescription_398779(String varInputValue) {
		waitForExpectedElement(driver, ProjectDescription_398779textarea);
		ProjectDescription_398779textarea.sendKeys(varInputValue);
	}

}