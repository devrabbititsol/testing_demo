package web.testing_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Checkbox_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.seleniumeasy.com/test/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Testing_Demo\",\"project_description\":\"desc\",\"project_id\":0,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":656,\"testcase_name\":\"TC_Checkbox_demo\",\"testcase_id\":560,\"testset_name\":\"TS_auto_demo\",\"testset_id\":83,\"executed_timestamp\":-1731391130,\"browser_type\":\"chrome,mozilla\",\"testcase_overwrite\":true}";

	public static String projectName = "testing_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Checkbox_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "#isAgeSelected")	
	private WebElement	Check_box_398477input;
	public String clkinputCheck_box_398477() {
		waitForExpectedElement(driver, Check_box_398477input);		
		String text = Check_box_398477input.getText();
		Check_box_398477input.click();
		return text;
	}

	@FindBy(how = How.CSS, using = "#easycont > div.row > div.col-md-6.text-left > div.panel.panel-default:nth-child(5) > div.panel-body > div.checkbox:nth-child(4) > label")	
	private WebElement	Option2_398394label;
	public String textlabelOption2_398394() {
		waitForExpectedElement(driver, Option2_398394label);		
		String text = Option2_398394label.getText();
		Option2_398394label.click();
		return text;
	}

	@FindBy(how = How.CSS, using = "#check1")	
	private WebElement	Option4_398392input;
	public String clkinputOption4_398392() {
		waitForExpectedElement(driver, Option4_398392input);		
		String text = Option4_398392input.getText();
		Option4_398392input.click();
		return text;
	}

}