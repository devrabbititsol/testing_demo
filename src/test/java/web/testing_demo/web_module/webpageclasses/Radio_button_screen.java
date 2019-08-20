package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Radio_button_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":0,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Radio_button_demo\",\"testcase_id\":561,\"testset_name\":\"TS_auto_demo\",\"testset_id\":83,\"executed_timestamp\":-1387579634,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Radio_button_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Female')]")	
	private WebElement	Female_398572label;
	public String textlabelFemale_398572() {
		waitForExpectedElement(driver, Female_398572label);		
		String text = Female_398572label.getText();
		Female_398572label.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Get Checked value')]")	
	private WebElement	GetCheckedValue_398568button;
	public String clkbuttonGetCheckedValue_398568() {
		waitForExpectedElement(driver, GetCheckedValue_398568button);		
		String text = GetCheckedValue_398568button.getText();
		GetCheckedValue_398568button.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Female')]")	
	private WebElement	Female1_398573label;
	public String textlabelFemale1_398573() {
		waitForExpectedElement(driver, Female1_398573label);		
		String text = Female1_398573label.getText();
		Female1_398573label.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'15 to 50')]")	
	private WebElement	To50_398610label;
	public String textlabelTo50_398610() {
		waitForExpectedElement(driver, To50_398610label);		
		String text = To50_398610label.getText();
		To50_398610label.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Get values')]")	
	private WebElement	GetValues_398567button;
	public String clkbuttonGetValues_398567() {
		waitForExpectedElement(driver, GetValues_398567button);		
		String text = GetValues_398567button.getText();
		GetValues_398567button.click();
		return text;
	}

}