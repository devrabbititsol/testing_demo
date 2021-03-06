package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Input_demo_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":89,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":391,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Input_form_demo\",\"testcase_id\":563,\"testset_id\":0,\"executed_timestamp\":-1364050182,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Input_demo_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Input Forms')]")	
	private WebElement	InputForms_398154a;
	public String clkaInputForms_398154() {
		waitForExpectedElement(driver, InputForms_398154a);		
		String text = InputForms_398154a.getText();
		InputForms_398154a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Input Form Submit')]")	
	private WebElement	InputFormSubmit_398157a;
	public String clkaInputFormSubmit_398157() {
		waitForExpectedElement(driver, InputFormSubmit_398157a);		
		String text = InputFormSubmit_398157a.getText();
		InputFormSubmit_398157a.click();
		return text;
	}

}