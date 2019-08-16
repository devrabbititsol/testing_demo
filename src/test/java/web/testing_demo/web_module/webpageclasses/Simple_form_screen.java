package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Simple_form_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":0,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Simple_form_demo\",\"testcase_id\":559,\"testset_name\":\"TS_auto_demo\",\"testset_id\":83,\"executed_timestamp\":-1726197826,\"browser_type\":\"chrome,mozilla\",\"testcase_overwrite\":true}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Simple_form_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "#user-message")	
	private WebElement	PleaseEnterYourMessage_398256input;
	public void fillinputPleaseEnterYourMessage_398256(String varInputValue) {
		waitForExpectedElement(driver, PleaseEnterYourMessage_398256input);
		PleaseEnterYourMessage_398256input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Show Message')]")	
	private WebElement	ShowMessage_398244button;
	public String clkbuttonShowMessage_398244() {
		waitForExpectedElement(driver, ShowMessage_398244button);		
		String text = ShowMessage_398244button.getText();
		ShowMessage_398244button.click();
		return text;
	}

	@FindBy(how = How.CSS, using = "#sum1")	
	private WebElement	EnterValueA_398308input;
	public void fillinputEnterValueA_398308(String varInputValue) {
		waitForExpectedElement(driver, EnterValueA_398308input);
		EnterValueA_398308input.sendKeys(varInputValue);
	}

	@FindBy(how = How.CSS, using = "#sum2")	
	private WebElement	EnterValueB_398309input;
	public void fillinputEnterValueB_398309(String varInputValue) {
		waitForExpectedElement(driver, EnterValueB_398309input);
		EnterValueB_398309input.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Get Total')]")	
	private WebElement	GetTotal_398302button;
	public String clkbuttonGetTotal_398302() {
		waitForExpectedElement(driver, GetTotal_398302button);		
		String text = GetTotal_398302button.getText();
		GetTotal_398302button.click();
		return text;
	}

}