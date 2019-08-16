package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Simple_demo_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":0,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Simple_form_demo\",\"testcase_id\":559,\"testset_name\":\"TS_auto_demo\",\"testset_id\":83,\"executed_timestamp\":-1712260190,\"browser_type\":\"chrome\",\"testcase_overwrite\":true}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Simple_demo_screen(WebDriver driver) {
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

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Simple Form Demo')]")	
	private WebElement	SimpleFormDemo_398088a;
	public String clkaSimpleFormDemo_398088() {
		waitForExpectedElement(driver, SimpleFormDemo_398088a);		
		String text = SimpleFormDemo_398088a.getText();
		SimpleFormDemo_398088a.click();
		return text;
	}

}